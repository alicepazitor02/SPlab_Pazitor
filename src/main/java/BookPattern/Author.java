package BookPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {
    public String name;

    public void print(){
        System.out.println("Author name: " + this.name);
    }
}