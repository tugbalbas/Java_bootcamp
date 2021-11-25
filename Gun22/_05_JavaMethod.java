package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */
    public static void main(String[] args) {
        Scanner oku = new Scanner (System.in);
        int secim = 0;

        do{
            menuYaz();
            secim = oku.nextInt();
            islemYap(secim);

        }while(secim >= 6);

    }

    public static void menuYaz(){

        System.out.println("***** Menü *****");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.println("5-Faktöriyel");
        System.out.println("6-Çıkış");
        System.out.println("Seçiminiz: ");
    }

    public static void islemYap( int secim){
        Scanner oku = new Scanner (System.in);

        int sayi1=0;
        int sayi2=0;

        switch (secim)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("1. Sayı: ");
                sayi1 = oku.nextInt();
                System.out.println("2. Sayı: ");
                sayi2 =oku.nextInt();
                break;
            case 5:
                System.out.println("Sayı: ");
                sayi1=oku.nextInt();
        }

        switch (secim)
        {
            case 1: toplamYaz(sayi1,sayi2);break;
            case 2: cikarmaYaz(sayi1,sayi2);break;
            case 3: carpmaYaz(sayi1,sayi2);break;
            case 4: bolmeYaz(sayi1,sayi2);break;
            case 5: faktoriyelYaz(sayi1);break;
        }
    }

    public static void toplamYaz (int s1, int s2) {
        System.out.println("Toplam: " + (s1+s2));
    }

    public static void cikarmaYaz (int s1, int s2) {
        System.out.println("Fark: " + (s1-s2));
    }

    public static void carpmaYaz (int s1, int s2) {
        System.out.println("Çarpım: " + (s1*s2));
    }
    public static void bolmeYaz (int s1, int s2) {
        System.out.println("Bölüm: " + (s1/s2));
    }

    public static void faktoriyelYaz (int s1) {
        int fakt = 1;
        for (int i = 0; i <=s1; i++) {
            fakt *= i;
        }
        System.out.println("Faktöriyel: " + fakt);
    }


}