package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply(5));
    }
    static UnaryOperator<Integer> unaryOperator = num -> num*num;
}
