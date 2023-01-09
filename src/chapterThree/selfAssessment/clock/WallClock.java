package chapterThree.selfAssessment.clock;

public class WallClock {
    public static void main(String[] args){

        Clock wallClock = new Clock(11,01,60);
        int hour = wallClock.getHour();
        int minute = wallClock.getMinute();
        int second = wallClock.getSecond();

        System.out.printf("%d%c%d%c%d",hour,':',minute,':',second);








    }
}
