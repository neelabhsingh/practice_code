package concurrent.execution_framework.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestRunnable {
    private static final int THREAD_POOL_SIZE = 5;
    public static void main(String [] args){
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        executorTasks(executorService);
        executorService.shutdown();
    }

    private static void executorTasks(ExecutorService executorService){
        executorService.execute(new LogTask("Application Started."));
        executorService.execute(new LogTask("Performing an action"));
        executorService.execute(new LogTask("Application finished..."));
    }
}

class LogTask implements Runnable{
    private final String message;
    LogTask(String message){
        this.message = message;
    }

    @Override
    public void run(){
        Logger.log(message);
    }
}

class Logger {
    static void log(String message){
        System.out.println("Logger:"+ message);
    }
}