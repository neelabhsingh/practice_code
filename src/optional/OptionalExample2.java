package optional;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Python", "C++");
        Optional<String> result = strings.stream().filter(s -> s.startsWith("J")).findFirst();
        result.ifPresent(System.out::println);
    }
}
