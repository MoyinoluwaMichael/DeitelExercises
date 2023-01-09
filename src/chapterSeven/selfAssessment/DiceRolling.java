package chapterSeven.selfAssessment;

import java.security.SecureRandom;

public class DiceRolling {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int[] diceAppearance = new int[13];

        for (int count = 1; count <= 36000000; count++) {
            int firstDie = 1 + secureRandom.nextInt(6);
            int secondDie = 1 + secureRandom.nextInt(6);
            int sum = firstDie + secondDie;
            diceAppearance[sum]++;
        }
        for (int count = 2; count <= 12; count++){
            System.out.println(count +" appears "+diceAppearance[count]+ " times");
        }
    }
}
