package Gun48.Soru2;

public class Account {
    private int accountNumber;
    private double balance;

    private static int number=1; // sayaç

    public Account( double balance) {
        this.accountNumber=number++;

        setBalance(balance);
    }
    public void deposit(double gelen){
        this.balance+=gelen;
    }
    public void withdraw(double giden){
        if (giden > 5000)
            throw new RuntimeException("Günlük limiti aştınız");

        this.balance-=giden;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
