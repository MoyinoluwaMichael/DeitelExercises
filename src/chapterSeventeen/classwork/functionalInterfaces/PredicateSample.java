package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        System.out.println(isSame.test("moyin"));
        System.out.println(isSame.and(name -> name.contains("z")).test("moyin"));
        System.out.println(isSame.or(name -> name.contains("z")).test("moyin"));
        System.out.println(isSame.negate().test("moyin"));
    }
    static Predicate<String> isSame = name -> name.contains("m");
}
