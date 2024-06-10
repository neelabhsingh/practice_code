package concurrent.lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;


public class ReentrantLockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyRunnable myRunnable = new MyRunnable(lock);
        new Thread(myRunnable, "Thread 1").start();
        new Thread(myRunnable, "Thread 2").start();
    }
}
class MyRunnable implements Runnable{
    Lock lock;
    public MyRunnable(Lock lock){
        this.lock = lock;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is waiting to acquire lock.");
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName() + " has acquired lock.");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName() +" didn't got lock.");
        }
    }
}