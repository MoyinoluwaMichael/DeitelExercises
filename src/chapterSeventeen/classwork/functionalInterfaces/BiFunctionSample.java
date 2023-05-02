package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        System.out.println(multiply.apply(3, 2));
        System.out.println(multiply.andThen((num1) -> num1 + 3).apply(3, 2));
    }
    static BiFunction<Integer, Integer, Integer> multiply = (num1, num2) -> (num1*num2)*2;
}
