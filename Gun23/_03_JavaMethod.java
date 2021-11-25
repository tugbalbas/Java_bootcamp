package Gun23;

import java.util.Scanner;

public class _03_JavaMethod {
    // method overloading
    public static void main(String[] args) {
        int s1=4;
        int s2=5;
        int s3=6;

        int sonuc1=toplam(s1,s2);
        int sonuc2=toplam(s1,s2,s3);

        String ad="ismet";
        String soyad="temur";
        String tamAd=toplam(ad,soyad);

        KullaniciBilgiYaz(44,"ismet Temur");
        KullaniciBilgiYaz("ismet Temur", 44);

    }

    // parametre tipinden de sırasına göre ayırt edilebilir
    public static void KullaniciBilgiYaz(int yas, String ad)
    {
        System.out.println(ad+" "+yas);
    }

    public static void KullaniciBilgiYaz(String ad, int yas)
    {
        System.out.println(ad+" "+yas);
    }

    // metdolara aynı isim verebiliriz, yeterki paramtetre sayısı
    // veya tipleri farklı olsun java  bizim yerimize hangisinin
    // kullanacağını bu farktan bulabiliyor.
    public static int toplam(int s1,int s2)
    {
        return s1+s2;
    }

    public static int toplam(int s1,int s2, int s3)
    {
        return s1+s2+s3;
    }

    public static String toplam(String ad, String soyad)
    {
        return ad+" "+soyad;
    }
}
