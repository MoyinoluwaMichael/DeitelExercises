package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        System.out.println(isSame.test("michael", 7));
        System.out.println(isSame.and((name, number) -> name.length() == number / 2).test("michael", 4));
    }
    static BiPredicate<String, Integer> isSame = (name, number) -> name.length() == number;
}
