package Gun23;

public class _01_JavaMethod {
    // return ifadesi
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // bunda veri gitmiyor ve veri dönmüyor
        toplamYaz(4,5); // bunda veri gidiyor ve veri dönmüyor

        int enb=Math.max(4,5); // hem veri gidiyor hem veri döndürüyor
        int toplam=toplamGetir(4,5); // hem veri alır ve hem de döndürür
        System.out.println(toplam);

        String ad="tugba";
        String soyad="albas";

        String tamAd=adSoyadBirlestir(ad,soyad);
        System.out.println("tamAd = " + tamAd);

    }

    // Metodun tipi STRING
    public static String adSoyadBirlestir(String a, String b) {
        return (a+" "+b); // bu fonk çağıran yere sonuç olarak bu değeri geri gönder
    }

    // int burada dönen verinin değerini belirtir VOID in yerine
    public static int toplamGetir(int a, int b){
        return (a+b); // bu fonk çağıran yere sonuç olarak bu değeri geri gönder
    }

    // void geri değer döndürmeyen demektir
    public static void toplamYaz(int a, int b){
        System.out.println((a+b));
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }

}
