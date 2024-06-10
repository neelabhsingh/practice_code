package concurrent;

import java.util.concurrent.*;
public class TestCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> stringFuture = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello from Future.";
            }
        });
        try {
            System.out.println(stringFuture.get());
        }catch (InterruptedException | ExecutionException ex){
            ex.printStackTrace();
        }
    }
}
