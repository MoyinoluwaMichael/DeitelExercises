package chapterSeven.selfAssessment.polling;
import chapterSeven.selfAssessment.polling.*;

import java.security.SecureRandom;
import java.util.Scanner;

public class PollingTest {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Polling.displayIssues(j));
                Polling.takeRatings(j, scanner.nextInt());
            }
        }
        Polling.displayPollingResult();
        System.out.println();
        System.out.println(Polling.displayPollingSummary());
    }
}
