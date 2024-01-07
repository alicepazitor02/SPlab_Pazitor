package BookPattern.services;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import BookPattern.models.Book;
import BookPattern.models.Image;
import BookPattern.models.ImageProxy;
import BookPattern.models.Paragraph;
import BookPattern.models.Section;
import BookPattern.models.Table;
import BookPattern.models.TableOfContents;
import BookPattern.models.Visitor;

public class BookSaveVisitor implements Visitor {
    private JSONArray jsonArray;

    public BookSaveVisitor() {
        this.jsonArray = new JSONArray();
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("title", section.getTitle());
        obj.put("section", item);

        jsonArray.put(obj);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("text", paragraph.getText());
        obj.put("paragraph", item);

        jsonArray.put(obj);
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("url", imageProxy.getUrl());
        obj.put("image", item);

        jsonArray.put(obj);
    }

    @Override
    public void visitImage(Image image) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("url", image.getUrl());
        obj.put("image", item);

        jsonArray.put(obj);
    }

    @Override
    public void visitTable(Table table) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("title", table.getTitle());
        obj.put("table", item);

        jsonArray.put(obj);
    }

    @Override
    public void visitTableOfContent(TableOfContents tableOfContent) {

    }

    public void exportJSON() {
        try (FileWriter file = new FileWriter("Book.json")) {
            file.write(jsonArray.toString(4));
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}