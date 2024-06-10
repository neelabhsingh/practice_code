package Collection.copyonwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("Element:" + element);
            if(element.equals("Banana")){
                list.remove("Cherry");
            }
        }
        System.out.println("List after iteration: "+ list);
    }
}
