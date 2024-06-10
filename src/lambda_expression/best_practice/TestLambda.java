package lambda_expression.best_practice;
import java.util.*;
public class TestLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,5,6,13,9);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum:"+ sum);
    }
}
