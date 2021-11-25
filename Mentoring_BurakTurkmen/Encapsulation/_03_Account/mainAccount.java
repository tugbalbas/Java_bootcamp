package Mentoring_BurakTurkmen.Encapsulation._03_Account;

public class mainAccount {
    public static void main(String[] args) {

        // Burda değer atamak için cons kullandık
        Account account1 = new Account(25,"Burak","brk@brk.com",1);

        System.out.println(account1.getAcc_number());
        System.out.println(account1.getName());
        System.out.println(account1.getEmail());
        System.out.println(account1.getAmount());

    }
}
