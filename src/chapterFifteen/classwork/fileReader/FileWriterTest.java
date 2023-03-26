package chapterFifteen.classwork.fileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter writer =
                new FileWriter("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\text.txt", true)){
            writer.append("TGIF");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
