package producerconsumer;

class SharedBuffer{
    private int data;
    private boolean available = false;
    private final Object lock = new Object();
    public synchronized void produce(int value){
        while (available){
            try {
                wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        data = value;
        available = true;
        lock.notifyAll();
    }
    public synchronized int consumer(){
        while (!available){
            try {
                wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        available = false;
        lock.notifyAll();
        return data;
    }
}
public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Thread producerThread = new Thread(() ->{
            int value =0;
            while (true){
                buffer.produce(value++);
            }
        });
        Thread consumerThread = new Thread(() ->{
            while (true){
                int data = buffer.consumer();
                System.out.println("Consumer"+ data);
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}
