package BookPattern.models;
public abstract class Element {

     private Element parinte = null;

    public Element getParinte() {
        return parinte;
    }

    public void setParinte(Element parinte) {
        this.parinte = parinte;
    }

    abstract void print();
    void add(Element elem) throws Exception {};
    void remove(Element elem){};
    Element get(int index){
          return null;
     }

    void accept(Visitor visitor){};
}