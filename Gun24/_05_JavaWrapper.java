package Gun24;

import java.util.ArrayList;

public class _05_JavaWrapper {
    public static void main(String[] args) {

// program sadece rakam veya harf gibi veya true false gibi,
        // basit değerler saklayacaksa hazfızada çok yer kaplamasın diye
        // aynı tiplerin basit yani primitive tilerini oluşturalım.
        // eğer bu değerlden fazlası gerekecekse ozaman bunların ilk harfi büyük
        // halleri olan tipleri kullanılsın

        int a=5; // sadece bir rakam tutar.
        // metodları yok. basit tip denir

        Integer b=6; // rakamla beraber , gerekli tüm fonsiyonları tutar.
        // metodları var. Buna kapsamlı tip denir.
        // Bunlara yani BÜYÜK harfle başlayan değişken isimlerine
        // WRAPPER yapısı denir.

        b=a;  // basit -> kapsamlı  : boxing denir.
        a=b;  // kapsamlı -> basit  : unBoxing denir.

        double c=3.4;
        Double d=5.6;

        char e='Y';
        Character f='Z';

        float k=7.8f;
        Float l=6.5f;



    }
}
