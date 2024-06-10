package interview.oracle;

import java.util.HashMap;
import java.util.*;
//Input: { ‘dog’. ‘Cat’, ‘cow’,’god’}
//output: {{dog,god},{cat},{cow}}
public class OracleTest {
    public static void main(String[] args) {
        String [] inputs = {"dog", "cat", "cow","god"};
        HashMap<String, List<String>> result = new HashMap<>();
        for(String input: inputs){
             char characterArray [] = input.toCharArray();
             Arrays.sort(characterArray);
             String wordKey = String.copyValueOf(characterArray);
             if(result.containsKey(wordKey)){
                 List<String> wordList = result.get(wordKey);
                 wordList.add(input);
             }else{
                 List<String> wordList = new ArrayList<>();
                 wordList.add(input);
                 result.put(wordKey, wordList);
             }
        }
        System.out.println(result);

    }
}
