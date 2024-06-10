package interview;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        //Take a list of number, 2, 5, 10, some random number.  Find out the second largest number into this list.
        List<Integer> numbers = Arrays.asList(1, 3, 8, 23, 28, 1, 2);

        int num2 = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
        System.out.println("Number:"+ num2);

        int num = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(num);
//        List<Integer> numberList =numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(numberList.get(numberList.size() -2));

        int num1 = numbers.stream().sorted(Comparator.reverseOrder()).limit(2).reduce((first, second) -> second).orElse(null);
        System.out.println("num1:"+ num1);

        int num3 = numbers.stream().sorted(Comparator.reverseOrder()).limit(2).reduce((first, second)->second).orElse(null);
        System.out.println("Num3:"+ num3);

        List<String> stringList = Arrays.asList("Apple", "Bannana");
        List<String> stringList1 = Arrays.asList("Bannana", "Graphs");
        List<List<String>> combineList = new ArrayList<>();
        combineList.add(stringList);
        combineList.add(stringList1);
        //List<String> commain = combineList.stream().flatMap(list -> )
    }
}
