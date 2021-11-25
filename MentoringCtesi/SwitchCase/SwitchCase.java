package MentoringCtesi.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        Sisteme sayı 1 ve sayı 2 olarak iki sayı giriniz.
//
//        Daha sonra hesap makinesinde hangi işlemleri yapmak istedigini sorun : Örn Konsolda şöyle olmalı :
//
//        1.Toplama
//        2.Cıkarma
//        3.Carpma
//        4.Bölme
//
//        Hangi işlemi yapmak istiyorsunuz ? Numarasını giriniz :
//
//
//
//        Eğer girilen numara 1 ise toplama
//        2 ise cıkarma
//        3 ise carpma
//        4 ise bölme işlemi yaptırın.
//        başka bir numara girerse "yanlış tuslama yaptınız" yazsın.
//                */

        Scanner scan = new Scanner(System.in);

        int sayac=0;
        while (sayac<3) {

            System.out.print("1. sayı giriniz");
            double sayi1 = scan.nextDouble();
            System.out.print("2. sayı giriniz");
            double sayi2 = scan.nextDouble();

            System.out.println("1.Toplama");
            System.out.println("2.Çıkarma");
            System.out.println("3.Çarpma");
            System.out.println("4.Bölme");

            System.out.println("\n Hangi işlemi yapmak istiyorsunuz? Numarasını giriniz: ");

            int secenek = scan.nextInt();

            switch (secenek) {
                case 1:
                    System.out.println(sayi1 + sayi2);
                    break;
                case 2:
                    System.out.println(sayi1 - sayi2);
                    break;
                case 3:
                    System.out.println(sayi1 * sayi2);
                    break;
                case 4:
                    System.out.println(sayi1 / sayi2);
                    break;
                default:
                    System.out.println("yanlış tuşlama yaptınız");
            }
     sayac++;
        }
    }
}
