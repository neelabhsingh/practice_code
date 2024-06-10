package stream.parallel;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.generate(new AtomicInteger()::getAndIncrement).limit(100000000).collect(Collectors.toList());
        long startTime1 = System.nanoTime();
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        long endTime1 = System.nanoTime();
        System.out.println("Time Taken by Stream: "+ (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        int sum2 = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        long endTime2 = System.nanoTime();
        System.out.println("Time Taken by ParallelStream:"+ (endTime2 - startTime2));
    }
}
