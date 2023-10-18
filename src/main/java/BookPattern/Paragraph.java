package BookPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paragraph implements Element{
    private String text;

    public void print() {
        System.out.println("Paragraph: " + this.text);
    }
}