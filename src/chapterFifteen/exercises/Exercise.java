package chapterFifteen.exercises;

public class Exercise {
    public static int getConsecutiveNumberIndex(int x, int y, int index) {
        return (y / x) + (index - 1);
//        int sum = 0;
//        int staticCount = 0;
//        int [] consecutiveNumbers = new int[x];
//        for (int i = 0; i < consecutiveNumbers.length; i++) {
//            consecutiveNumbers[i] = staticCount;
//            staticCount++;
//        }
//        while (sum != y){
//            sum = 0;
//            for (int i = 0; i < consecutiveNumbers.length; i++) consecutiveNumbers[i] += 1;
//            for (int each: consecutiveNumbers) sum+=each;
//            staticCount++;
//        }
//        return consecutiveNumbers[index];
    }

    public static void main(String[] args) {
        System.out.println(getConsecutiveNumberIndex(3, 36, 2));
    }
}
