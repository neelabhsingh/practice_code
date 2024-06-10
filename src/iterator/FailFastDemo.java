package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new CopyOnWriteArrayList<>();
        list.add("Neelabh");
        list.add("Aadvik");
        list.add("SomeOneAfterAadvik");
        list.add("NoOne");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println("Name" +str);
            if(str.equals("NoOne")){
                list.remove(str);
                //itr.remove();
            }
        }
    }
}
