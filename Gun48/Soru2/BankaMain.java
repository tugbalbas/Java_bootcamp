package Gun48.Soru2;

public class BankaMain {
    public static void main(String[] args) {

        try {
            Account account=new Account(10000);
            account.deposit(1000);
            System.out.println("account.getBalance() = " + account.getBalance());
            account.withdraw(6000);
            System.out.println("account.getBalance() = " + account.getBalance());
        }
        catch (Exception ex){
            System.out.println("Hata mesajı: " + ex.getMessage());
        }


    }
}
