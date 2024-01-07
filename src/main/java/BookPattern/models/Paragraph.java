package BookPattern.models;
import BookPattern.services.AlignStrategy;
import lombok.Getter;

public class Paragraph extends Element{
    @Getter
    private String text;
    private AlignStrategy textAlignement = null;

    public Paragraph(String text)
    {
        this.text = text;
    }

    public void accept(Visitor visitor)
    {
        visitor.visitParagraph(this);
    }
    public void print()
    {
        if (textAlignement == null)
            System.out.println(text);
        else
            textAlignement.render(text);

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


    public void setAlignStrategy(AlignStrategy alignStrategy) {
        textAlignement = alignStrategy;
    }


}