package chapterFive.assignment;

public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {


        String dayPosition = "";
        String outro = "";
        String intro = "";
        String remainder = "";

        for(int day = 1; day <= 12; day++){
            switch (day){
                case 1 -> {
                    dayPosition = "first";
                    outro = "A partridge in a pear tree";
                }
                case 2 -> {
                    dayPosition = "second";
                    outro = "Two turtle doves, and";
                }
                case 3 -> {
                    dayPosition = "third";
                    outro = "Three french hens";
                }
                case 4 -> {
                    dayPosition = "fourth";
                    outro = "Four calling birds";
                }
                case 5 -> {
                    dayPosition = "fifth";
                    outro = "Five golden rings";
                }
                case 6 -> {
                    dayPosition = "sixth";
                    outro = "Six geese a-laying";
                }
                case 7 -> {
                    dayPosition = "seventh";
                    outro = "Seven swans a-swimming";
                }
                case 8 -> {
                    dayPosition = "eighth";
                    outro = "Eight maids a-milking";
                }
                case 9 -> {
                    dayPosition = "ninth";
                    outro = "Nine ladies dancing";
                }
                case 10 -> {
                    dayPosition = "tenth";
                    outro = "Ten lords a-leaping";
                }
                case 11 -> {
                    dayPosition = "eleventh";
                    outro = "Eleven pipers piping";
                }
                case 12 -> {
                    dayPosition = "twelfth";
                    outro = "Twelve drummers drumming";
                }
            }
            remainder = outro + "\n" + remainder;
            intro = "On the " + dayPosition + " day of Christmas, my true love sent to me";
            System.out.printf("%s%n%s%n", intro, remainder);
        }

    }
}
