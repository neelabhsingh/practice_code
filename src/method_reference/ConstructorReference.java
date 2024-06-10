package method_reference;

import java.util.*;
import java.util.stream.Collectors;
public class ConstructorReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> doubleNumbers  = numbers.stream().map(Integer::new).collect(Collectors.toList());
        doubleNumbers.forEach(System.out::println);
    }
}
