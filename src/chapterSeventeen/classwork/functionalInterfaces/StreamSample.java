package chapterSeventeen.classwork.functionalInterfaces;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample {
    public static void main(String[] args) {
//        int[] val = IntStream
//                .generate(() -> 1 + new Random().nextInt(5))
//                .limit(4)
//                .toArray();
//        System.out.println(Arrays.toString(val));
//
//        System.out.println(IntStream.iterate(0, i -> i < 20, x -> x + 2)
//                .boxed()
//                .toList());
//        Map<String, Integer> names2 = new HashMap<>();
//        List<String> names = List.of(
//                "Moyin",
//                "Prof",
//                "Ble",
//                "James"
//        );
//        System.out.println(names.stream().collect(Collectors.toMap(x -> x, String::length)).entrySet());

        Map<String, Integer> namesAndAge = new HashMap<>();
        namesAndAge.put("James", 40);
        namesAndAge.put("Moyin", 25);
        namesAndAge.put("Ble", 35);
        namesAndAge.put("Prof", 30);
//        System.out.println(namesAndAge.entrySet().stream().sorted(Map.Entry.comparingByValue()).toList().stream()
//                .collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue(), (i, j) -> i, LinkedHashMap::new)));
    }
}
