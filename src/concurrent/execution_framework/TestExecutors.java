package concurrent.execution_framework;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
public class TestExecutors {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> futureTask = executorService.submit(() ->{
            return 123;
        });
        try {
            Integer result = futureTask.get();
            System.out.println("Result of Task 1:"+ result);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
