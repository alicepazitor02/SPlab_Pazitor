package BookPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public Chapter(String name) {
        this.name = name;
        this.subChapterList = new ArrayList<>();
    }

    public int createSubChapter(String subChapterTitle) {
        SubChapter newSubChapter = new SubChapter(subChapterTitle);
        subChapterList.add(newSubChapter);
        return subChapterList.indexOf(newSubChapter);
    }

    public SubChapter getSubChapter(int index) {
        if (index >= 0 && index < subChapterList.size()) {
            return subChapterList.get(index);
        } else {

            return null;
        }
    }
    public void print(){
        System.out.println("Chapter: " + this.name);

        for(SubChapter subChapter:subChapterList){
            subChapter.print();
        }
    }

}