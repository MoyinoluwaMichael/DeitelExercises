package leetcode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Formatter;

public class Date {
    private static String getDate(String date){
        String [] dates = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
        return String.format("%s, %s %s %s", localDate.getDayOfWeek(), dates[0], localDate.getMonth(), dates[2]);
//        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);
    }

//    private static String convertFrom(String date){
//
//    }

    public static void main(String[] args) {
        System.out.println(getDate("17/04/2023"));
//        String word = "Renike,Moyin,James,Efe";
//        String [] splittedWord = word.split("e");
    }

}
