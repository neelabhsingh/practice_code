package test12;
/*
List<Integer> list = {1,3,2,1,4,5,}
Remove duplicates from this list using java 8
{1,5,15,20,20,18,25,90}
Print multiples of 5 from the list using Java 8
[3:10 PM] Vinita
Check if the strings are anagrams using core java:
str1 = “listen”  str2 = “silent”
 */
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,1,4,5);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);

        List<Integer> list1 = Arrays.asList(1,5,15,20,20,18,25,90);
        List<Integer> result1 = list1.stream().filter( num -> num % 5 == 0).collect(Collectors.toList());
        System.out.println("result1"+ result1);

        String str1 = "listen";
        String str2 = "silent";
        if(str1.length() != str1.length()){
            System.out.println("String are not annagrams");
            return;
        }
        char [] anagrams1 = str1.toCharArray();
        char [] anagrams2 = str2.toCharArray();

        Arrays.sort(anagrams1);
        Arrays.sort(anagrams2);
        for(int i=0; i<anagrams1.length; i++){
            if(anagrams1[i] != anagrams2[i]){
                System.out.println("Given Strings are not annagrams");
                return;
            }
        }

        System.out.println("Given Strings annagrams");


    }
}
