package stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberStartWithGivenNumber{
    public static void main(String [] args){
        Integer [] numbers = {1110, 102, 207, 2345, 23, 45, 102};
        List<Integer> list = Arrays.asList(numbers);
        Predicate<Integer> numberStartWithOne = number ->{
            while(number >=10){
                number/=10;
            }
            return  number ==1;
        };

        Predicate<Integer> numberStartWithTwo =  number ->{
            while (number>=10){
                number /=10;
            }
            return number == 2 ;
        };
        System.out.println("Printing Number starts with One");
        List<Integer> result = list.stream().filter(numberStartWithOne).collect(Collectors.toList());
        result.forEach(System.out::println);
        /*
        Output
        Printing Number starts with One
        1110
        102
        102
        * */
        System.out.println("Printing Number starts with Two");

        String numberStartWithTwoString =list.stream().filter(numberStartWithTwo).map(number -> number.toString()).collect(Collectors.joining(", "));
        System.out.println(numberStartWithTwoString);
        /*
        * Printing Number starts with Two
          207, 2345, 23
        * */
        System.out.println("Int Predicate Demo");
        int [] numbers2 = {1110, 23, 45, 102};
        IntPredicate numberStartWithOneIntVersion = number -> {
            while(number >=10){
                number/=10;
            }
            return number ==1;
        };
        Arrays.stream(numbers2).filter(numberStartWithOneIntVersion).forEach(System.out::println);
        /*OUTPUT
        Int Predicate Demo
        1110
        102
         */
    }

}