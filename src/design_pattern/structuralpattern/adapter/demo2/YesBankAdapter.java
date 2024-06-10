package design_pattern.structuralpattern.adapter.demo2;

public class YesBankAdapter implements  BankAPI{
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sentMoney(String senderAccount, String receiverAccount, double amount) {
        System.out.println("Sending Amount from sender to receiver account.");
        return false;
    }
}
