package stream.TestSum;

import java.util.*;

public class TestSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: "+ sum);
    }
}
