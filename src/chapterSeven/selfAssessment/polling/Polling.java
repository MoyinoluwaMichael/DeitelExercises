package chapterSeven.selfAssessment.polling;

public class Polling {

    private static final String[] issues = {"Political issues", "Global environmental issues", "Health issues", "Education issues", "Religious issues"};
    private static final int[][] ratings = new int[5][11];

    public static String displayIssues(int index) {
        return issues[index];
    }

    public static void takeRatings(int index, int rate) {
        ratings[index][rate]++;
    }

    public static void displayPollingResult() {
        System.out.println("TOPICS                                1    2    3    4    5    6    7    8    9    10     Average");
        for (int i = 0; i < issues.length; i++) {
            System.out.printf("%-38s", issues[i]);
            for (int j = 1; j < ratings[i].length; j++) {
                System.out.printf("%-5s", ratings[i][j]);
            }
            System.out.printf("%6.2f", getTopicRatingsAverage(i));
            System.out.println();
        }
    }

    private static double getTopicRatingsAverage(int row) {
        int totalRatings = 0;
        int totalNoRatings = 0;
        for (int i = 1; i < ratings[row].length; i++) {
            totalNoRatings += ratings[row][i];
            totalRatings += i * ratings[row][i];
        }
        return (totalRatings * 1.0) / totalNoRatings;
    }

    public static String displayPollingSummary() {
        int highestTotalPoint = Integer.MIN_VALUE;
        int issueWithHighestTotalPoint = 0;
        int lowestTotalPoint = Integer.MAX_VALUE;
        int issueWithLowestTotalPoint = 0;
        for (int j = 1; j < ratings.length; j++) {
            int totalRatings = 0;
            for (int i = 1; i < ratings[j].length; i++) {
                totalRatings += i * ratings[j][i];
            }
            if (totalRatings > highestTotalPoint) {
                highestTotalPoint = totalRatings;
                issueWithHighestTotalPoint = j;
            }
            if (totalRatings < lowestTotalPoint) {
                lowestTotalPoint = totalRatings;
                issueWithLowestTotalPoint = j;
            }
        }
        return String.format("""
                %s has the highest total point total with %d points
                %s has the lowest total point total with %d points
                       """, issues[issueWithHighestTotalPoint], highestTotalPoint, issues[issueWithLowestTotalPoint], lowestTotalPoint);
    }

}