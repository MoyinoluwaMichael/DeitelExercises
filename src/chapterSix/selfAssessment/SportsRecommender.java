package chapterSix.selfAssessment;

public class SportsRecommender {
    private static String recommendSportFor(int temperatureICelsius){
        if (temperatureICelsius >= 20 && temperatureICelsius <= 30){
            return "It’s lovely weather for sports today!";
        } else if (temperatureICelsius >= 10 && temperatureICelsius <= 40) {
            return "It’s reasonable weather for sports today.";
        }
        return "Please exercise with care today, watch out for the weather!";
    }

    public static void main(String[] args) {
        System.out.println(recommendSportFor(9));
    }
}
