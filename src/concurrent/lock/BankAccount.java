package concurrent.lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final ReentrantLock lock = new ReentrantLock();
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        lock.lock();
        try{
            double newBalance = balance + amount;
            updateBalance(newBalance);
        }finally {
            lock.unlock();
        }
    }
    public void withdraw(double amount){
        lock.lock();
        try{
            double newBalance = balance -amount;
            updateBalance(newBalance);
        }finally {
            lock.unlock();
        }
    }
    private void updateBalance(double newBalance){
        lock.lock();
        try {
            balance = newBalance;
        }finally {
            lock.unlock();
        }
    }
    public double getBalance(){
        lock.lock();
        try {
            return balance;
        }finally {
            lock.unlock();
        }
    }
    private static class InsufficientFundsException extends RuntimeException{
        public InsufficientFundsException(String message){
            super(message);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Thread t1 = new Thread(() ->{
            account.deposit(500);
            System.out.println("Balance after deposit : $"+ account.getBalance());
        });
        Thread t2 = new Thread(() ->{
            account.withdraw(100);
            System.out.println("Balamce after withdraw : $"+ account.getBalance());
        });
        t1.start();
        t2.start();
    }
}
