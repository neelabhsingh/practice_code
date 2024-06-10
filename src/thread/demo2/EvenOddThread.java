package thread.demo2;

public class EvenOddThread {
    private int count =1;
    private final int MAX = 20;
    public void printOdd(){
        synchronized (this){
            while (count<MAX){
                while (count %2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Odd thread:"+ count++);
                notify();
            }
        }

    }
    public void printEven(){
        synchronized (this){
            while (count<MAX){
                while (count %2 == 1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Even Thread:"+ count++);
                notify();
            }
        }
    }
    public static void main(String[] args) {
        EvenOddThread evenOddThread = new EvenOddThread();
        Thread t1 = new Thread(() -> evenOddThread.printEven());
        Thread t2 = new Thread(() -> evenOddThread.printOdd());
        t1.start();
        t2.start();
    }
}
