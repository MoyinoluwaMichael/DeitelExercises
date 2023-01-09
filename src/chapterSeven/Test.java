package chapterSeven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {

    private static String add(String name, int ... numbers){
        int result = 0;
        for (int count = 1; count < numbers.length; count++){
            result+=numbers[count];
            System.out.println(numbers[count]);
        }
        return "Dear "+name+", your result is "+result;
    }
    public static void main(String[] hot) {

        int [] numbers = {1,3,4,35,46,8,67,56,45};
        String [] list = {"Adewale", "Ogunbiyi", "Moyinoluwa", "Adekunle", "Ogundimu", "Clara", "James", "Prof"};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.println(Arrays.toString(numbers));
        int [] numbersCopy = new int [numbers.length];
        System.arraycopy(numbers,0, numbersCopy, 1, numbers.length-1);
        System.out.println("Numbers: "+Arrays.toString(numbers));
        System.out.println("NumbersCopy: "+Arrays.toString(numbersCopy));
        System.out.println(Arrays.equals(numbers, numbersCopy));
        Arrays.sort(numbersCopy);
        System.out.println(Arrays.binarySearch(numbersCopy, 23435));


        int [] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        int max = Arrays.stream(sortedNumbers).max().getAsInt();
        System.out.println(Arrays.toString(sortedNumbers));
        System.out.println(max);



//        int[][] numbers = new int[3][3];
//
//        int arrayNumber = 1;
//        for (int count = 0; count < numbers.length; count++) {
//            for (int num = 0; num < numbers[count].length; num++) {
//                numbers[count][num] = arrayNumber;
//                arrayNumber++;
//            }
//        }
//        System.out.println(Arrays.deepToString(numbers));

//        int [] cohort13 = new int [25];
//        int [] cohort14 = new int [45];
//        int [] cohort15 = new int [29];
//
//        int [][] village = new int [3][];
//        village[0] = cohort13;
//        village[1] = cohort14;
//        village[2] = cohort15;
//
//        int [][][] country = new int[1][][];
//        country[0] = village;
//
//        for (int[][] villag: country) {
//            for (int [] cohort: villag) {
//                System.out.println(Arrays.toString(cohort));
//                System.out.println();
//            }
//        }

        }
    }

