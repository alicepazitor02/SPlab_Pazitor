package BookPattern.services;

import BookPattern.models.Book;
import BookPattern.models.Image;
import BookPattern.models.ImageProxy;
import BookPattern.models.Paragraph;
import BookPattern.models.Section;
import BookPattern.models.Table;
import BookPattern.models.TableOfContents;
import BookPattern.models.Visitor;

public class TableOfContentsUpgrade implements Visitor {

    private TableOfContents tableOfContent = new TableOfContents();
    private int page = 1;
    public TableOfContentsUpgrade()
    {

    }


    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

        tableOfContent.addEntry(section.getTitle() + "..........." + page);
    }

    @Override
    public void visitTableOfContent(TableOfContents tableOfContent) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        page += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        page += 1;
    }

    @Override
    public void visitImage(Image image) {
        page += 1;
    }

    @Override
    public void visitTable(Table table) {
        page += 1;
    }

    public TableOfContents getToC() {
        return this.tableOfContent;
    }

}