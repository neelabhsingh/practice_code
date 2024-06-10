package Collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class HashMapExample{
    public static void main(String [] args){
        Map<String, Long> phoneBook = new HashMap<>();
        phoneBook.put("Neelabh", 12132123L);
        phoneBook.put("Sushama", 232323L);
        phoneBook.put("Aadvik", 232121L);
        Iterator<String> itr =  phoneBook.keySet().iterator();
        while(itr.hasNext()) {
            String personName = itr.next();
            System.out.println(personName);
            if (personName.equals("Sushama")) {
                phoneBook.put("Naveen", 8128182L);
            }
        }
    }
}
