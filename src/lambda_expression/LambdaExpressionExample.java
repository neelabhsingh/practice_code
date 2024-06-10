package lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Supplier;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();
        groceryList.add("Sugar");
        groceryList.add("Salt");
        groceryList.add("Soap");
        groceryList.forEach( a -> System.out.println(a));
        List<String> names  = Arrays.asList("Alice", "Charlie", "Bob");
        Collections.sort(names,(s1, s2) -> s1.compareToIgnoreCase(s2) );
        names.forEach(name -> System.out.println(name));
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumber = numbers.stream().filter(n -> n %2 ==0).collect(Collectors.toList());
        System.out.println("Print Even Number");
        evenNumber.forEach(number -> System.out.println(number));
        List<String> lowercaseNames = names.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> lowerCaseNames = names.stream().map(String::toLowerCase).collect(Collectors.toList());

    }
}
