package BookPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;




public class Book extends Section {
    
    
    private List<Author> authorList;
    

    public Book(String title) {
        super(title);
        this.authorList = new ArrayList<Author>(); // Here a new author list is initialized
    }

    public Book(Book other){
        super(other.title);
        this.authorList = new ArrayList<>(other.authorList);

    }

    public void addAuthor(Author authorName){
        authorList.add(authorName);
    }

    public void addContent(Element element){
        elementList.add(element);
    }
    
    public void print(){
        System.out.println("Book: " + this.title);
        for(Author author:authorList){
            author.print();
        }

        for(Element element: elementList){
            element.print();
        }

        
    }
}