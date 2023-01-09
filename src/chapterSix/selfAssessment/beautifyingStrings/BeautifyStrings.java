package chapterSix.selfAssessment.beautifyingStrings;

public class BeautifyStrings {

    public static String capitalizeFirstLetter(String sentence){
        char firstLetter = sentence.charAt(0);
        return sentence.replaceFirst(String.valueOf(sentence.charAt(0)), String.valueOf(firstLetter).toUpperCase());
    }

    public static String addFullStop(String sentence){
        char lastLetter = sentence.charAt(sentence.length() - 1);
        if (lastLetter != '.'){
            return sentence.concat(".");
        }
        return sentence;
    }

}
