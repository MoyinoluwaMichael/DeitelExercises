package leetcode;

public class IndexAddition {
    private static int getSum(int [][] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) for (int j = 0; j < numbers[i].length; j++) sum+=numbers[i][j];
            else sum+=numbers[i][numbers[i].length -1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(getSum(numbers));
    }
}
