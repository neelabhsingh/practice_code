package stream.generator;

import java.util.*;
import java.util.stream.Stream;
public class RandomDoubleStream {
    public static void main(String[] args) {
        // Generate 8 random Double values
        Stream.generate(new Random()::nextDouble) .limit(8) .forEach(System.out::println);

    }
}
//Output: 0.5390254520295368 0.8477297185718798 0.23703352435894398 0.09156832989674057 0.9671295321757734 0.9989670394813547 0.8909416330715489 0.08177639888829968