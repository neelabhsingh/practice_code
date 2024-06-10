package array;

import java.util.*;
import java.util.stream.Collectors;

public class MedianSortedArrays {
    public static void main(String[] args) {
        List<Integer>  number = Arrays.asList(1,2,3,4,5);
        long sum = number.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
