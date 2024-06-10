package design_pattern.structuralpattern.adapter.demo2;

public class PhonePe {
    public static void main(String[] args) {
        BankAPI bankAPI = new ICICIApiAdapter();
        String neelabhAccountNumber = "12121";
        String sushamaAccountNumber ="34333";
        double amount = 100;
        bankAPI.getBalance(neelabhAccountNumber);
        bankAPI.sentMoney(neelabhAccountNumber, sushamaAccountNumber, amount);
    }
}
