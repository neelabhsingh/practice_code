package method_reference;

import java.util.*;
public class ClassMethodReference {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
