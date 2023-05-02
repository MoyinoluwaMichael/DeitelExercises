package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Moyinoluwa", "Michael"));
    }

    static BinaryOperator<String> binaryOperator = (firstName, lastName) -> firstName + " " + lastName;
}
