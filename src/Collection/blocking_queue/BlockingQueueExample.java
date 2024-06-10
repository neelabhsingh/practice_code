package Collection.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    private final BlockingQueue<String> queue;
    Producer(BlockingQueue blockingQueue){
        this.queue = blockingQueue;
    }
    public void run(){
        try{
            while (true){
                queue.put(product());
            }
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
    private String product(){
        return "Product is Produced";
    }
}

class Consumer implements Runnable{
    private final BlockingQueue<String> queue;

    Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true){
                consume(queue.take());
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    void consume(String product){
        System.out.println(product +" Product is consumed.");
    }
}
public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(10);
        Producer producer = new Producer(queue);
        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
