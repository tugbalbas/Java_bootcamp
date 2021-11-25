package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50den büyük-eşit ise geçtiniz.
        // Küçük ise kaldınız yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.println("Notu giriniz: ");
        int ogrNot=oku.nextInt();
        // ogrNot = 60 olsun
        if (ogrNot >= 50){
            System.out.println("Geçtiniz, tebrikler");
        }

        // Yukarıdaki iflerde her zaman kontrol edilme durumuj vardır
        // halbuki aşağ ıf else YAPISINDA İF ŞARTI çalıştığında else
        // kontrol edilmesine gerek kalmaz

        if (ogrNot < 50){
            System.out.println("Kaldınız");
        }
        if (ogrNot >=50){
            System.out.println("Geçtiniz, tebrikler");
        }
        else {
            System.out.println("Kaldınız.");
        }
    }
}
