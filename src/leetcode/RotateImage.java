package leetcode;

import java.util.Arrays;

public class RotateImage {
    private static int[][] rotate(int[][] matrix) {
        int [][] result = new int[matrix[0].length][matrix.length];
        int count = result[0].length-1;
        for (int[] ints : matrix){
            for (int j = 0; j < ints.length; j++) result[j][count] = ints[j];
            count--;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(result[i], 0, matrix[i], 0, matrix[i].length);
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (var row : rotate(num)) {
            System.out.println(Arrays.toString(row));
        }
    }
}
