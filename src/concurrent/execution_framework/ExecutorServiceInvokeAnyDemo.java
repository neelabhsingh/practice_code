package concurrent.execution_framework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAnyDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = Arrays.asList(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3"
        );
        try{
            String result = executor.invokeAny(tasks);
            System.out.println("Result:"+ result);

        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}
