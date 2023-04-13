package chapterFifteen.exercises.pizzaDeleveries;

public class Pizza {
    private static void calculateNoOfPizza(int noOfEaters, int minimumSatisfaction, int maximumSatisfaction){
        int noOfSlices = (minimumSatisfaction * 2) + (maximumSatisfaction * 3) +
                (noOfEaters - (minimumSatisfaction+maximumSatisfaction));
        int noOfBoxes = noOfSlices / 6;
        int rem = noOfSlices % 6;
        System.out.printf("""
                Total No of Pizza boxes to be bought: %s
                Total No of pizza slices to be eaten: %s
                Pizza slices remaining: %s
                """, noOfBoxes, noOfSlices, rem);
    }
    public static void main(String[] args) {
        calculateNoOfPizza(40, 5, 2);
    }
}
