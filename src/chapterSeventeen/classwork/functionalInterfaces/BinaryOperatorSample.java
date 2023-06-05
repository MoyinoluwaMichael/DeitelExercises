package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Moyinoluwa", "Michael"));
    }

    static BinaryOperator<String> binaryOperator = (firstName, lastName) -> firstName + " " + lastName;
    static IntBinaryOperator intBinaryOperator = Integer::sum;
}
