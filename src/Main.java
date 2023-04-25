import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of your asterisk");
        int userInput = scanner.nextInt();
        int count = 1;
        while (count <= userInput) {
            int count2 = 0;
            while (count2 < count) {
                System.out.print("*");
                count2++;
            }
            System.out.println();
            count++;
        }

    }
}