package chapterFifteen.exercises;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
    public static void main(String[] args) {

        try(Socket socket = new Socket("172.16.0.24", 1234);
        ) {
            System.out.println("Connected!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
