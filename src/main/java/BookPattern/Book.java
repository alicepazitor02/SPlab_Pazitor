package BookPattern;




import java.util.ArrayList;
import java.util.List;




public class Book extends Section {
    
    
    private List<Author> authorList;
    

    public Book(String title) {
        super(title);
        this.authorList = new ArrayList<Author>(); // Here a new author list is initialized
    }

    

    public void addAuthor(Author authorName){
        authorList.add(authorName);
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