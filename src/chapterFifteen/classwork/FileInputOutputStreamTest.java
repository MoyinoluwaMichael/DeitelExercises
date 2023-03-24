package chapterFifteen.classwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputOutputStreamTest {
    public static void main(String[] args) {

        try(FileInputStream fileInputStream =
                    new FileInputStream("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\text.txt")){
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (byte b : bytes) {
                System.out.print(Character.toString(b)+" ");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (var fileOutputStream =
                     new FileOutputStream("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\text2.txt")){
            byte[] bytes =
                    {72, 101, 108, 108, 111, 32, 99, 101, 101, 110};
            fileOutputStream.write(bytes);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
