package BookPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Table implements Element {
    private String title;

    public void print() {
        System.out.println("Table with Title: " + this.title);
    }
}