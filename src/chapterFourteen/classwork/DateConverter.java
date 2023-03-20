package chapterFourteen.classwork;

import java.time.LocalDate;

public class DateConverter {
    private static String convert(String date){
        String [] dates = date.split("/");
        return String.format("%s %s, %s", dates[0], LocalDate.of(
                Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), 1).getMonth().toString(), dates[2]);
    }
    public static void main(String[] args) {
        System.out.println(convert("01/11/1970"));
    }
}
