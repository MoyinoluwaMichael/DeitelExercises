package chapterSeventeen.classwork.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        consumerDeclarative
                .andThen(name -> System.out.println(name+" 50"))
                .andThen(name -> System.out.println(name+"lastly")).accept("Moyin");
    }

    static Consumer<String> consumerDeclarative = name -> System.out.println(name+"");
}
