package concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMapModificationDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        new Thread(() -> {
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
                try {
                    // Pauses the current thread for 100 milliseconds.
                    // This can be used to simulate time-consuming tasks,
                    // or to pause execution to allow other threads to run.
                    // In this case, it allows another thread to potentially
                    // modify the structure of the map during iteration,
                    // which can trigger a ConcurrentModificationException.
                    Thread.sleep(100);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put("key4", "value4");
        }).start();
    }
}
