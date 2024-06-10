package stream.test;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 9, 16, 25, 36);
        double sum = numbers.stream().map(Math::sqrt).mapToDouble(Double::doubleValue).sum();
        System.out.println("Sum: "+ sum);

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

    }
}
