package BookPattern;

public class Section extends Element {
    protected String title;
    

    public Section(String title) {
        this.title = title;
        
    }

    public Section(Section other) {
        this.title = other.title;
        
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elementList) {
            element.print();
        }
    }

    
}
