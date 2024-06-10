package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyEventNumberByTwo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> resultNums = nums.stream().map(num -> num %2 == 0 ? num *2 : num).collect(Collectors.toList());
        System.out.println(resultNums);

    }
}
