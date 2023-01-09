package chapterFive.deitelExercises;

public class TheSumOfSerieS {
    public static void main(String[] args) {

        long sumOfSeries = 0;
        for (int count = 1; count <= 100; count++){
            System.out.print(count + " + " + sumOfSeries);
            sumOfSeries+=count;
            System.out.println(" = " + sumOfSeries);
        }
    }

}
