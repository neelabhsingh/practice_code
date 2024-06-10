package stream.creation;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class StreamCreation{
    public static void main(String args[]){

        //1. From Collections:
        List<String> list = Arrays.asList("J2EE", "Hibernate", "JPA");
        Stream<String> streamFromList = list.stream();

        //2. From Specified Values:
        Stream<Integer> streamFromValues = Stream.of(1,2,3,4,5);

        //3. From Arrays:
        String[] array = new String[]{"A", "B", "C"};
        Stream<String> streamFromArray = Arrays.stream(array);

        //4. From Stream.builder();
        Stream<String> streamFromBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        //5. Empty Stream
        Stream<String> emptyStream = Stream.empty();

        //6. From Primitive Types
        IntStream intStream = IntStream.range(1,4);
        LongStream longStream = LongStream.range(1,4);
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);




    }
}
