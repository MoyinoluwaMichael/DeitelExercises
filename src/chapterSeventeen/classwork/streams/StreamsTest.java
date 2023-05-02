package chapterSeventeen.classwork.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 2, 3, 4, 5, 1);
        System.out.println(Arrays.toString(Arrays.stream(new int[]{1, 2, 3, 4, 5}).map(x -> x * 2).toArray()));
        numbers.stream().filter(x -> x % 2 == 0).forEachOrdered(System.out::println);
    }
}
