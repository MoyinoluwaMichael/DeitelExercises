package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        matchNameAndAge.accept("Moyin", 25);
    }
    static BiConsumer<String, Integer> matchNameAndAge = (name, age) -> System.out.println(name+" "+age);
}
