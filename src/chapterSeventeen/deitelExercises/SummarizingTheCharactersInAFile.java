package chapterSeventeen.deitelExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizingTheCharactersInAFile {
    public static void main(String[] args) throws IOException {
        Map<String, Long> words = Files.lines(Paths.get("C:\\Users\\Moyinoluwa Michael\\Documents\\txtSample.txt"))
                .flatMap(lines -> Stream.of(lines.split("")))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));
        System.out.println(words);
    }
}
