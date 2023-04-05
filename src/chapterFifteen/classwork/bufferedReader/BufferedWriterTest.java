package chapterFifteen.classwork.bufferedReader;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterTest {
    public static void main(String[] args) {
        String[] words = {"QWERTY", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        try(OutputStreamWriter writer =
                new OutputStreamWriter(new FileOutputStream("\"C:\\\\Users\\\\Moyinoluwa Michael\\\\" +
                        "IdeaProjects\\\\inTheBeginning\\\\src\\\\chapterFifteen\\\\classwork\\\\text.txt\""));
                        BufferedWriter bufferedWriter = new BufferedWriter(writer)
        ){
            bufferedWriter.write(words[0]);
            bufferedWriter.flush();
            bufferedWriter.write(words[2]);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
