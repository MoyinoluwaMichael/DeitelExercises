//Write statements that will display a random number from each of the following sets:
//        a) 0, 3, 6, 9, 12.
//        b) 1, 2, 4, 8, 16, 32.
//        c) 10, 20, 30, 40.
package chapterSix.selfAssessment;

import java.security.SecureRandom;

public class secureRandomTest {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int firstRandomNumber = 3 * secureRandom.nextInt(5);
        System.out.println(firstRandomNumber);

        int secondRandomNumber = 1 + secureRandom.nextInt(6);
        System.out.println(secondRandomNumber);

        int thirdRandomNumber = 10 + 10 * secureRandom.nextInt(4);
        System.out.println(thirdRandomNumber);

        System.out.println(Math.ceil(12.9));
        System.out.println(Math.floor(12.9));

    }
}
