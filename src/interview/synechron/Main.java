package interview.synechron;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//a z, A -> Z, 0 -9


public class Main {
    public static void main(String[] args) {
        String str ="Hj@34ch @ hj # jj";
        //Map<Character, Long> map = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c ->c, Collectors.counting()));
        Map<Character, Long> map = str.chars().mapToObj(c -> (char)c)
                .filter(c -> !Character.isAlphabetic(c)  && !Character.isWhitespace(c))
                        .collect(Collectors.groupingBy(c ->c, Collectors.counting()));

        map.entrySet().stream().forEach(e -> System.out.println("Character:"+ e.getKey() +", Count:"+ e.getValue()));
        //map.entrySet().stream().forEach(e  -> System.out.println("Character :"+ e.getKey() +", Frequency: "+e.getValue()));
        //map.entrySet().stream().filter(e -> e.getValue());

    }
}
