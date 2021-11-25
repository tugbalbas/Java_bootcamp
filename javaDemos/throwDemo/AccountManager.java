package javaDemos.throwDemo;

public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount) throws Exception {
        if (balance >= amount){
            balance-=amount;
        }
        else {
            throw new BalanceInsufficentException("Bakiye yetersiz"); // Sen bunu handle etmedin dolayısıyla
            // bunu kim kullanacaksa burdan bi exception fırlayabileceğini bilsin o try catch içerisine alsın
        }

    }

    public double getBalance() { // hesaptaki parayı okumamızı sağlıyor
        return balance;
    }
}
