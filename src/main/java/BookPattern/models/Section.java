package BookPattern.models;
import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
    private String title;
    private List<Element> elementList;

    public Section(String title) {
        this.title = title;
        elementList = new ArrayList<>();
    }

    public String getTitle(){
        return this.title;
    }
    public List<Element> getElementList()
    {
        return elementList;
    }

    public void accept(Visitor visitor)
    {
        visitor.visitSection(this);
        for(Element elem : elementList)
             elem.accept(visitor);
    }

    public void print() {
        System.out.println(title);
        for(Element elem : elementList)
            elem.print();
    }

    public void add(Element elem) throws Exception{
        if(elem.getParinte() == null)
        {
            elem.setParinte(this);
            elementList.add(elem);
        } else {
            throw new Exception("Elementul exista deja");
        }
    }

    public void remove(Element elem){
        elementList.remove(elem);
        elem.setParinte(null);
    }

    public Element get(int index) {
        return this.elementList.get(index);
    }


}