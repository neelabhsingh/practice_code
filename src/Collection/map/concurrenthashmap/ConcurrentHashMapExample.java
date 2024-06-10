package Collection.map.concurrenthashmap;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample{
    public static void main(String [] args){
        Map<String, Integer> currentHashMap = new ConcurrentHashMap<>();
        Runnable task = () ->{
            String threadName = Thread.currentThread().getName();
            for(int i=0; i<5; i++){
                currentHashMap.compute(threadName, (key, value) -> value == null? 1: value +1);
                System.out.println(threadName+"-updated map: "+ currentHashMap);
            }
        };
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch(InterruptedException  ex){
            ex.printStackTrace();
        }
        System.out.println("Final map content: " + currentHashMap);
    }
}