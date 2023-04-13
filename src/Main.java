import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your date of birth in this format: dd/mm/yyyy");
            String dob = scanner.nextLine();
            String [] dmy = dob.split("/");

            if (LocalDateTime.now().getYear() - Integer.parseInt(dmy[2]) < 18) System.err.println("You are Illegible");
            else System.out.println("You are legible");
        }

    }
}