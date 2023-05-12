package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        intConsumer.accept(5);
    }
    static IntConsumer intConsumer = System.out::println;
}
