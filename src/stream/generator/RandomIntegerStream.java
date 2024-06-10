package stream.generator;

import java.util.*;
import java.util.stream.Stream;
public class RandomIntegerStream {
    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
    }
}
//Output: 697197501 50139200 321540264 1042847655 -770409472