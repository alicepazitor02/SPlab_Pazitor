package BookPattern;



import lombok.NoArgsConstructor;


@NoArgsConstructor

public class Paragraph extends Element{

    protected  String text;

    public Paragraph (String text){
        this.text = text;
    }
    
    public Paragraph(Paragraph other){
        this.text = other.text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

    @Override

    public Element clone(){
        return new Paragraph(this);
    }

}