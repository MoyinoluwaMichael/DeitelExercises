package chapterSix.assignment;

public class PrimeNumbers {
    private static int checkIfNumberIsPrime(int number) {
        int primeNumberCount = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                primeNumberCount++;
            }
        }
        if (primeNumberCount == 2) {
            System.out.println(number + " is a prime number");
            return number;
        }
        return 0;
    }

    private static void displayPrimeNumbersIn(int number) {
        int primeNumberCount = 0;
        for (int counter = 1; counter <= number; counter++) {
            int primeNumber = checkIfNumberIsPrime(counter);
            if (primeNumber > 0) {
                primeNumberCount++;
            }
        }
        System.out.println("There are " + primeNumberCount + " prime numbers in " + number);
    }

    public static void main(String[] args) {
        displayPrimeNumbersIn(10000);
    }
}
