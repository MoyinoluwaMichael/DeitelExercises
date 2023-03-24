package chapterFourteen.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String reg = "[a-zA-Z{2}]";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher("da");
        System.out.println(matcher.matches());
    }
}
