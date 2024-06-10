package interview3;

import java.util.ArrayList;
import java.util.List;

/*
How to generate all permutations of a given Input string : abc
abc
acb
bac
bca
cab
cba
 */
public class Test {
    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        permutations.forEach(System.out::println);
    }
    public static List<String> generatePermutations(String input){
        List<String> permutations = new ArrayList<>();
        permute(new StringBuilder(input), 0, input.length() -1, permutations);
        return permutations;
    }
    public static void permute(StringBuilder str, int left, int right, List<String> result){
        if(left == right){
            result.add(str.toString());
        }else{
            for(int i = left; i<=right; i++){
                swap(str, left, i);
                permute(str, left +1, right, result);
                swap(str, left, i);
            }
        }
    }
    public static void swap(StringBuilder str, int index1, int index2){
        char temp = str.charAt(index1);
        str.setCharAt(index1, str.charAt(index2));
        str.setCharAt(index2, temp);
    }
}
