package BookPattern;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import BookPattern.models.Book;
import BookPattern.models.Image;
import BookPattern.models.ImageProxy;
import BookPattern.models.Paragraph;
import BookPattern.models.Section;
import BookPattern.models.Table;
import BookPattern.services.BookSaveVisitor;
import BookPattern.services.RenderContentVisitor;
import BookPattern.services.TableOfContentsUpgrade;




@SpringBootApplication

public class Main {

    public static void createTableOfContent() throws Exception {
        Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));

        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 4"));
        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        b.addContent(cap1);
        b.addContent(cap2);
        TableOfContentsUpgrade tocUpdate = new TableOfContentsUpgrade();
        b.accept(tocUpdate);
        tocUpdate.getToC().accept(new RenderContentVisitor());
    }

    public static void main(String[] args) throws Exception {
        /*Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();*/
        //createTableOfContent();
        Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));

        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 4"));
        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        b.addContent(cap1);
        b.addContent(cap2);

        BookSaveVisitor bookSaveVisitor = new BookSaveVisitor();
        b.accept(bookSaveVisitor);
        bookSaveVisitor.exportJSON();

    }
}