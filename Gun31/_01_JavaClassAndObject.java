package Gun31;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    public static void main(String[] args) {
        // çalışan yer
        int sayi; // bir tanımlamayı böyle yapıyorduk
        Scanner oku=new Scanner(System.in);

        //1.Nesne oluşturma: aşamalı
        Araba seninAraban; // fabrikaya sipariş veriyorsunuz,
        // üretilecek arabaya sizin adınız yazılıyor.ortada bir araba yok
        seninAraban=new Araba();// üretilmiş oldu , artık meydanda kullanılabilir

        //2.Nesne Oluşturma: tek işlemde tanımlama ve oluşturma.
        Araba benimArabam=new Araba(); // Araba cinsinden YENİ bir ARABA oluştur,
        // başlangıç değerleri ile bir araba üretilmiş
        // insan türünden yeni bir insan oluşur adı ismet gibi.

        benimArabam.renk="kirmizi";
        benimArabam.yili=2021;
        benimArabam.motorHacmi=1600;

        seninAraban.renk="siyah";
        seninAraban.yili=2020;
        seninAraban.motorHacmi=2000;

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);

    }
    // metodun yazıldığı yer
}
// 1. yöntem Class tanımlama
class Araba{ // bu tasarıma class diyoruz ve bu şekilde tanımlanıyor
    // Özellikleri ve metodları yazdır
    String renk;
    int yili;
    double motorHacmi;

}