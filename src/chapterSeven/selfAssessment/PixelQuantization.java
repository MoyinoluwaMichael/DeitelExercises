package chapterSeven.selfAssessment;

import java.util.Arrays;

public class PixelQuantization {
    public static void main(String[] args) {
        int [] imagePixelColours = new int[180];
        int imagePixelColourValue = 10;
        int rangeCount = 0;
        for (int count = 0; count < imagePixelColours.length; count++){
            rangeCount++;
            if (rangeCount == 20){
                imagePixelColourValue += 20;
                rangeCount = 0;
            }
            imagePixelColours[count] = imagePixelColourValue;
        }
        System.out.println(Arrays.toString(imagePixelColours));
    }
}
