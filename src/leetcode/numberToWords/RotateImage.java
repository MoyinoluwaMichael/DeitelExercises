package leetcode.numberToWords;

import java.util.Arrays;

public class RotateImage {
    private static int[][] rotate(int [][] matrix){
        int [] temp = Arrays.copyOf(matrix[0], matrix.length);
        for (int i = 0; i < 3; i++) {
            matrix[i][0] = matrix[2][i];
            matrix[i][1] = matrix[1][i];
            matrix[i][2] = temp[i];
        }
        return matrix;
    }
    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(arr)));
    }
}
