package interview3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String name ="Neelabh";
//        List<Character> reverse = name.chars().mapToObj(c -> (char)c).collect( (c1, c2) -> );
        Map<Character, Long> countCharacters = name.chars().mapToObj(c->(char)c).collect( Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(countCharacters);


    }
}
