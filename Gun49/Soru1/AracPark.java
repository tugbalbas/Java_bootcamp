package Gun49.Soru1;

public class AracPark {
    public static void main(String[] args) {
        Otobus otobus=new Otobus("Beyaz",5000,"Mercedes",40);
        System.out.println("otobus.toString() = " + otobus.toString()); // burada otomatik toString çağırıyor
        System.out.println("otobus = " + otobus); // otobus yazmak bile yeterli
    }
}
