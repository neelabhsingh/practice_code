package concurrent.execution_framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInvokeAllDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = Arrays.asList(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3"
        );
        try{
            List<Future<String>> results = executor.invokeAll(tasks);
            for(Future<String> resultFuture : results){
                System.out.println("Result:"+ resultFuture.get());
            }
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}
