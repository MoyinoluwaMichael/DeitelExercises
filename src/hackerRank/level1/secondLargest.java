package hackerRank.level1;

public class secondLargest {
    private static int findSecondLargest(int [] numbers){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondLargest = 0;
        for (int eachNumber : numbers) {
            if (eachNumber > largest) largest = eachNumber;
            if (eachNumber < smallest) smallest = eachNumber;
            if (eachNumber < largest && eachNumber > smallest) secondLargest = eachNumber;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int []{4,2,5,2,56,6,4,8}));
    }
}
