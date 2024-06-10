package lambda_expression.supplier;
import java.util.*;
import java.util.function.*;
public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        System.out.println(randomSupplier.get());
        Supplier<List<String>> listSupplier = ArrayList::new;
        Consumer<String> printing = System.out::println;
        List<String> names = listSupplier.get();

        names.add("Neelabh");
        names.forEach(printing);
    }
}
