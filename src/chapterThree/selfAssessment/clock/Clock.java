package chapterThree.selfAssessment.clock;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (second < 60){
            this.second = second;
        }
        if (second > 59) {
            second = 0;
            minute += 1;
        }
        if (minute < 60){
            this.minute = minute;
        }
        if (minute > 59) {
            minute = 0;
            hour += 1;
        }
        if (hour < 24){
            this.hour = hour;
        }
        if(hour > 23) {
            hour = 0;
        }

    }

    public void setHour(int hour){
        if(hour > 23){hour = 0;}
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if(minute > 59) {
            minute = 0;
            hour += 1;
        }
        this.minute = minute;
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second){
        if(second > 59) {
            second = 0;
            minute += 1;
        }
        this.second = second;
    }
    public int getSecond(){
        return second;
    }

    public int displayTime;


}
