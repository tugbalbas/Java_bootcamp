package Gun12;

import java.util.Scanner;

public class _06_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi: ");
        int kacaKadarRandomSayi = oku.nextInt();

        int uretilenSayi= (int) (Math.random() * kacaKadarRandomSayi)+1;

        System.out.print("Sayı tahmini: ");
        int tahmin = oku.nextInt();

        // 1. yöntem normal if ile
        if (tahmin==uretilenSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemediniz");

        //2. yöntem
        String sonuc= (uretilenSayi==tahmin) ? "Tebrikler" : "Bilemediniz";
        System.out.println("sonuc = " + sonuc);

        System.out.println("uretilenSayi = " + uretilenSayi);

    }
}
