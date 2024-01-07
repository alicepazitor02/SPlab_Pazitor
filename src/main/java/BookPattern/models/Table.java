package BookPattern.models;

import lombok.Getter;

public class Table extends Element {
    @Getter
    private String title;

    public Table(String title)
    {
        this.title = title;
    }

    public void accept(Visitor visitor)
    {
        visitor.visitTable(this);
    }

    public void print()
    {
        System.out.println("Table with Title:  " + this.title);
    }

    @Override
    public void add(Element elem) {

    }

    @Override
    public void remove(Element elem) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

}



