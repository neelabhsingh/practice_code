package lambda_expression.function.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleByTwoForEvenDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        MultipleByTwoForEven multipleByTwoForEven = num -> num %2==0 ? num *2 : num;
        List<Integer> result = list.stream().map(multipleByTwoForEven::apply).collect(Collectors.toList());
        System.out.println(result);
    }
}
