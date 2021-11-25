package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplam T\nÇıkartma Ç\nÇarpma P\nBölme B\nGiriniz. ");
        Scanner okuStr = new Scanner(System.in);
        String islem = okuStr.next(); // String tipinde okundu
        // "T" -> T\n -> en az 2 karakterdir
        // int, char, double, String ? kelime\n -> "T" -> T\n


        switch (islem) { // buranın tipi ne ise casedekiler de o olmalı
            case "T":
                System.out.println("toplam = " + (sayi1 + sayi2));
                break;
            case "Ç":
                System.out.println("Çıkartma = " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("Çarpma = " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("Bölme = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("hatalı değer");

        }

        char islemChar = islem.charAt(0);

        switch (islemChar) { // buranın tipi ne ise casedekiler de o olmalı
            case 'T':
                System.out.println("toplam = " + (sayi1 + sayi2));
                break;
            case 'Ç':
                System.out.println("Çıkartma = " + (sayi1 - sayi2));
                break;
            case 'P':
                System.out.println("Çarpma = " + (sayi1 * sayi2));
                break;
            case 'B':
                System.out.println("Bölme = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("hatalı değer");

        }


//        switch (islem) { // buranın tipi ne ise casedekiler de o olmalı
//            case "Toplama":
//                System.out.println("toplam = " + (sayi1 + sayi2));
//                break;
//            case "Çıkarma":
//                System.out.println("Çıkartma = " + (sayi1 - sayi2));
//                break;
//            case "Çarpma":
//                System.out.println("Çarpma = " + (sayi1 * sayi2));
//                break;
//            case "Bölme":
//                System.out.println("Bölme = " + (sayi1 / sayi2));
//                break;
//            default:
//                System.out.println("hatalı değer");
//
//        }

    }
}