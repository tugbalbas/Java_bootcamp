package Gun36._03_Constructor;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.

    public static void main(String[] args) {
        Banka banka1 = new Banka("Yapı Kredi",1900,1980);
        Banka banka2 = new Banka("İş bankası",1960);
        Banka banka3 = new Banka("Ziraat Bankası");

        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);
    }

}
