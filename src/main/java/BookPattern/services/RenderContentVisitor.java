package BookPattern.services;
import BookPattern.models.Book;
import BookPattern.models.Image;
import BookPattern.models.ImageProxy;
import BookPattern.models.Paragraph;
import BookPattern.models.Section;
import BookPattern.models.Table;
import BookPattern.models.TableOfContents;
import BookPattern.models.Visitor;
public class RenderContentVisitor<T> implements Visitor{

    @Override
    public void visitBook(Book book) {
        System.out.println(book.getTitle());
    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.getTitle());
    }

    @Override
    public void visitTableOfContent(TableOfContents tableOfContent) {
        tableOfContent.print();
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }

}
