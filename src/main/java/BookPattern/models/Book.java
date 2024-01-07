package BookPattern.models;


import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private List<Author> authorList = new ArrayList<>();
    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    public void print()
    {
        System.out.println("Book: " + super.getTitle());
        System.out.println();
        System.out.println("Authors:");
        for(Author au: authorList)
        {
            System.out.print("Author: ");
            au.print();
        }
        System.out.println();
        for(Element elem: super.getElementList())
            elem.print();
    }

    public void accept(Visitor visitor)
    {
        visitor.visitBook(this);
        for(Element elem: super.getElementList())
            elem.accept(visitor);
    }

    public void addContent(Element element) {
        try
        {
            super.add(element);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}