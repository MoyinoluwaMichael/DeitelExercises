package chapterFourteen.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String reg = "[[a-z]+[A-Z]+]{4,}";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher("DGHGS");
        System.out.println(matcher.matches());
    }
}
