package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        System.out.println(sqr.apply(5));
        System.out.println(sqr.compose(num -> (Integer) num * 2).apply(5));
        System.out.println(sqr.andThen(num -> num * 2).apply(5));
    }

    static Function<Integer, Integer> sqr = num -> num * num;
}
