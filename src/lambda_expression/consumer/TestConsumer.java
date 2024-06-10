package lambda_expression.consumer;
import java.util.*;
import java.util.function.*;
public class TestConsumer {
    public static void main(String[] args) {
        List<String> names  = Arrays.asList("Amit", "Neelabh", "Manish", "Neeraj");
        Consumer<String> printName = System.out::println;
        names.forEach(printName);
    }
}
