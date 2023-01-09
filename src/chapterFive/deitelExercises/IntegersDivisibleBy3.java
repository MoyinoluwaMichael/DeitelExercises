package chapterFive.deitelExercises;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {

        int sumOfIntegers = 0;
        for (int count = 1; count <= 30; count++){
            if (count % 3 == 0){
                sumOfIntegers+=count;
            }
        }
        System.out.println("The sum of the integers between 1 and 30 that are divisible by 3 is: "+sumOfIntegers);
    }
}
