package BookPattern;
import lombok.Setter;
public class Paragraph extends Element{

    protected  String text;
    @Setter
    private AlignStrategy alignStrategy;
    public Paragraph (String text){
        this.text = text;
    }
    
    public Paragraph(Paragraph other){
        this.text = other.text;
    }

    @Override
    public void print() {
        if(alignStrategy != null)
            alignStrategy.render(text);
        else new AlignLeft().render(text);
    }

    @Override

    public Element clone(){
        return new Paragraph(this);
    }

}