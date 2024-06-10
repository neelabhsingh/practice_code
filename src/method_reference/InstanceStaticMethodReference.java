package method_reference;

import java.util.*;
public class InstanceStaticMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jim", "Joan");
        names.forEach(System.out::println);
    }
}
