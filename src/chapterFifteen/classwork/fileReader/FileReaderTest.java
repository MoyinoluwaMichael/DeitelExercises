package chapterFifteen.classwork.fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderTest {
    public static void main(String[] args) {
        char[] chars = new char[1024];
        try (FileReader fileReader =
                new FileReader("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\text.txt")){
            var numberOfCharRead = fileReader.read(chars);
            System.out.println(numberOfCharRead);
            System.out.println(Arrays.toString(chars));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
