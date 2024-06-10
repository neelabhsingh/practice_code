package method_reference;

import java.util.Arrays;
public class CustomMethodReferenceExample {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        String [] stringArray = {"Steve", "Rick", "Aditya", "Negan", "Lucy", "Jon"};
        Arrays.sort(stringArray, myComparator::compareByNameLength);
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}

class MyComparator{
    public int compareByNameLength(String str1, String str2){
        return Integer.compare(str1.length(), str2.length());
    }
}