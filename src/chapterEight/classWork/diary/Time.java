package chapterEight.classWork.diary;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    private String date;
    private int hour;
    private int minute;
    private String suffix;

    public Time(){
        date = LocalDateTime.now().toLocalDate().toString();
        hour = LocalDateTime.now().getHour();
        minute = LocalDateTime.now().getMinute();
        suffix = hour > 12 ? "PM" : "AM";
    }

    public String getDate(){
        return String.format("""
                Date: %s
                """, date);
    }
    public String getTime(){
        return String.format("""
                Time: %s:%s %s
                """ , hour, minute, suffix);
    }
    @Override
    public String toString(){
        return String.format("""
                Date: %s
                Time: %s:%s %s
                """, date, hour, minute, suffix);
    }
}
