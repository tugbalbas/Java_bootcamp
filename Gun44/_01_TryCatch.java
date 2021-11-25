package Gun44;

import java.util.Scanner;

public class _01_TryCatch {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        try {// hatanın olma ihtimalinin olduğu kodlar bu bloğa alınır
            System.out.print("1.sayı giriniz");
            int sayi1 = oku.nextInt();

            System.out.print("2.sayı giriniz");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (Exception hata)// hata olduğunda çalışacak bölüm
        {
            System.out.println("Hata oldu.");
            System.out.println("Hata mesajı: "+hata.getMessage());
            //hata.printStackTrace(); // hatanın geçtiği aşamaları yazar
        }

        // 2. sayı girildiğinde ArithmeticException
        // harf girildiğinde ise InputMismatchException hatası veriyor.
    }
}
//        1.sayı giriniz5
//        2.sayı giriniz0
//        Hata oldu.
//        Hata mesajı: / by zero
//        java.lang.ArithmeticException: / by zero
//        at Gun44._01_TryCatch.main(_01_TryCatch.java:17)

// 2. durumda int olmadığı için null değeri veriyor
//        1.sayı giriniz:a
//        Hata oldu.
//        Hata mesajı: null