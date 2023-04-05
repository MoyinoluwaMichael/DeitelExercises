package chapterFifteen.classwork.bufferedReader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    public static void main(String[] args) {

        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter("C:\\Users\\Moyinoluwa Michael\\IdeaProjects\\inTheBeginning\\src\\chapterFifteen\\classwork\\text.txt")
        ){
            System.out.println("Enter some texts");
            String input = bufferedReader.readLine();
            writer.write(input);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
