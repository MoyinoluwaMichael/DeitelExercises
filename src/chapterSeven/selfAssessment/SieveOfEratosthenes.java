package chapterSeven.selfAssessment;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {

        boolean[] primeNumbers = new boolean[1000];
        Arrays.fill(primeNumbers, true);
//        First Method:
//        for (int i = 2; i < primeNumbers.length; i++) {
//            int primeNumberCount = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    primeNumberCount++;
//                }
//            }
//            primeNumbers[i] = primeNumberCount == 2;
//        }
//        for (int i = 2; i < primeNumbers.length; i++) {
//            System.out.println(i + " => "+ primeNumbers[i]);
//        }
//        Second Method
        for (int i = 2; i < primeNumbers.length; i++) {
            if (primeNumbers[i]){
                for (int j = i+i; j < primeNumbers.length; j+=i) {
                    primeNumbers[j] = false;
                }
            }
        }
        for (int i = 2; i < primeNumbers.length; i++) {
            System.out.println(i + " => " + primeNumbers[i]);
        }
    }
}
