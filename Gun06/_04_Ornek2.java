package Gun06;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız, değer atayınız
        // double değişkeni short değişkene çevirerek
        // bütün değerleri ekrana yazdırınız.

        double oran = 4000.4567;
        short kisa= 0;

        kisa = (short) oran;

        System.out.println("kisa = " + kisa); // kisa = 4000
        System.out.println("oran = " + oran); // oran = 4000.4567

        double sayi = 6578.49;
        short  deger = 2225;

        deger = (short) sayi;
    }
}
