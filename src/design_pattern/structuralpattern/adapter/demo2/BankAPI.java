package design_pattern.structuralpattern.adapter.demo2;

public interface BankAPI {
    double getBalance(String accountNumber);
    boolean sentMoney(String senderAccount, String receiverAccount, double amount);
}
