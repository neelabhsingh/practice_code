package thread.demo1;

public class OddEven {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
           for(int i=0; i<10; i++){
               if(i%2!=0) {
                   System.out.println("Odd Number:" + i);
               }
           }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=10; i++){
                if(i%2 == 0){
                    System.out.println("Even Number"+ i);
                }
            }
        });
        t1.start();
        t1.join();
        t2.start();
    }
}
