package stream;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWithOneExample{
    public static void main(String [] args){
        int [] numbers = {1110, 23, 45, 102};
        IntPredicate numberStartWithOne = number -> {
            while(number >=10){
                number/=10;
            }
            return number ==1;
        };

        Predicate<Integer> startWithOne = number ->{
            while (number>=10){
                number/=10;
            }
            return number == 1;
        };
        Arrays.stream(numbers).filter(numberStartWithOne).forEach(System.out::println);
        List<Integer> list = Arrays.asList(1110, 23, 45, 102);
        List<Integer> result = list.stream().filter(startWithOne).collect(Collectors.toList());
        System.out.println(result);
    }
}