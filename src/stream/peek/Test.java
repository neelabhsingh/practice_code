package stream.peek;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");
        long count = names.stream().peek(System.out::println).count();
        System.out.println("Testing");
        Predicate<String> startWithJ = name -> name.startsWith("J");
        List<String> nameStartWithJList =  names.stream()
                .filter(startWithJ)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("Checkinh for each");
        nameStartWithJList.stream().forEach(System.out::println);
        System.out.println("Count="+ count);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<String> strings = numbers.stream().map(Object::toString).collect(Collectors.toList());
        strings.forEach(System.out::println);
        int [] numbers1 = {11,12,13,14,15,16};
        System.out.println("TEsting");
        List<String> strings1 = Arrays.asList(numbers1).stream().map(Object::toString).collect(Collectors.toList());
        strings1.forEach(System.out::println);

        String name = "Neelabh";

        String reverse = name.chars().mapToObj(c -> (char)c).reduce("", (s, c)->c+s, (s1,s2) ->s2+s1);
        System.out.println("Reverse:"+ reverse);

        String hello ="Hello World";
        System.out.println("Hello World");
        IntStream intArray = hello.chars();
        intArray.forEach(System.out::println);
        Stream<Character>  characterStream = hello.chars().mapToObj(c  -> (char)c);
        characterStream.forEach(System.out::println);

        System.out.println("Print in sorted order");
        List<Character> sortedCharacter = hello.chars()
                .mapToObj( c -> (char)c)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        sortedCharacter.forEach(System.out::println);

        List<String> list = Arrays.asList("Z", "A", "Z", "K", "M", "C", "R", "Q", "B");
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

    }
}
