package chapterFour.assignment;

import java.util.Scanner;

public class OddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;
        int userInput = 1;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        while (userInput > 0){
            System.out.println("Enter a number, enter any negative number to exit");
            userInput = input.nextInt();
            if (userInput % 2 == 0){
                numberOfEvenNumbers += 1;
                sumOfEvenNumbers += userInput;
            }
            else { if (userInput % 2 > 0){
                numberOfOddNumbers += 1;
                sumOfOddNumbers += userInput;
                }
                else { if (userInput < 0){
                            break;
                    }
                }
            }
        }
        System.out.printf("Number of odd numbers entered is %d%nNumber of even numbers entered is %d%nSum of odd numbers is %d%nSum of even numbers is " +
                "%d", numberOfOddNumbers, numberOfEvenNumbers, sumOfOddNumbers, sumOfEvenNumbers);




    }
}
