package stream.testflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(9,10,11,12));
        List<Integer> result = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(result);

    }
}
