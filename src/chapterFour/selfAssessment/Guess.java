package chapterFour.selfAssessment;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int winningNumber = 17;

        System.out.print("Welcome to the winners' forum\nNo one is a loser here.\n\nGuess a number between 1 and 20: ");
        int userInput = input.nextInt();

        for (int count = 1;count < 5;count++) {
            if (userInput == winningNumber){
                System.out.print("Ori e pe bi alajo shomolu\nEnter your account number to get the cash gift: ");
                String accountNumber = input.next();
                System.out.println("Congratulations! Kindly wait as we process your cash gift.");
                break;
            }
            else {
                if (userInput > winningNumber && userInput <= 20){
                    System.out.print("Ouch! That's somehow higher than the winning number\nTry again: ");
                    userInput = input.nextInt();
                }
                if(userInput < winningNumber && userInput > 0) {
                    System.out.print("Ouch! That's somehow lower than the winning number\nTry again: ");
                    userInput = input.nextInt();
                }
                else {
                    System.out.print("Eran ni e, la oju e kedere.\nGuess a number between 1 and 20: ");
                    userInput = input.nextInt();
                }
            }
        }
        System.out.print("Game Over!");




    }



}
