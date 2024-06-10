package stream;

import java.util.*;
import java.util.stream.Collectors;

public class TestFlatMap {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "This is sentence");
        List<String> word =  sentences.stream().map(sentence -> sentence.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        word.stream().forEach(System.out::println);

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4,5),
                Arrays.asList(6)
        );
        List<Integer> flattenedList = lists.stream().flatMap(List::stream).collect(Collectors.toList());
        flattenedList.stream().forEach(System.out::println);
    }
}
