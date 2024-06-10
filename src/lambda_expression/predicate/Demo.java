package lambda_expression.predicate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        Predicate<String> startWithA = name -> name.startsWith("A");
        List<String> nameStartWithA = names.stream().filter(startWithA).collect(Collectors.toList());
        Predicate<String> longerThanThree = name -> name.length() > 3;
        Predicate<String> startWithC = name -> name.startsWith("C");
        List<String> filteredNames = names.stream().filter(longerThanThree.and(startWithC)).collect(Collectors.toList());
        System.out.println(nameStartWithA);
        System.out.println(filteredNames);
    }
}
