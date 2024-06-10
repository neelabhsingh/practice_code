package concurrent.execution_framework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer{

    private static final int THREAD_POOL_SIZE = 50;

    public static void main(String [] args){
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        //Simulate a stream of client requests
        for(int i=0; i< 100; i++){
            int requestId = i;
            executorService.submit(() -> handleClientRequest(requestId) );
        }
    }
    private static void handleClientRequest(int requestId){
        System.out.println("Start handling client request " + requestId +"on thread" + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finished handling client request "+ requestId);
    }
}