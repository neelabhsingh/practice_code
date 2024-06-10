package stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class CharacterFrequency{
    public static void main(String [] args){
        String input = "jaavvaaawooord";
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //frequencyMap.forEach((character, count) -> System.out.println(character+": "+ count));
        Map<Character, Long>   frequencyMap2 = characterStream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String str = "this is interview.";
        Map<Character, Long> frequencyMap3 = characterStream(str).filter(c -> !c.equals(' ')).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequencyMap3.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ":"+ entry.getValue()));


    }

    private static Stream<Character> characterStream(String s){
        return s.chars().mapToObj(c -> (char)c);
    }
}