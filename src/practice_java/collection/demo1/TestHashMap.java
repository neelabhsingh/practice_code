package practice_java.collection.demo1;
import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One",1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println("Testing Key"+ entry.getKey());
            System.out.println("Testing value"+ entry.getValue());
        }
    }
}
