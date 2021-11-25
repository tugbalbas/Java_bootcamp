package Mentoring_BurakTurkmen.Encapsulation._03_Account;

public class Account {

    private long acc_number;
    private String name;
    private String email;
    private float amount;

    public Account(long acc_number, String name, String email, float amount) {
        this.acc_number = acc_number;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }
}
