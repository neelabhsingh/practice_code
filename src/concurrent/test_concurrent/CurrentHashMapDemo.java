package concurrent.test_concurrent;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CurrentHashMapDemo {
    private static final int NUM_THREADS = 5;
    private static final int NUM_INSERTIONS = 12;
    private static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) throws InterruptedException{
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
        for(int i=0; i< NUM_THREADS; i++){
            executorService.execute(insertRecord());
        }
        //executorService.execute(insertRecord());
        executorService.shutdown();
        if(!executorService.isTerminated()){
            Thread.sleep(1000);
        }
        System.out.println("Size of the hashmap="+ hashMap.size());
    }

    private static Runnable insertRecord(){
        return () -> {
            for(int i=0; i<NUM_INSERTIONS; i++){
                System.out.println("Key:"+ i+Thread.currentThread().getName());
                hashMap.put(i+Thread.currentThread().getName(), i);
            }
        };
    }
}
