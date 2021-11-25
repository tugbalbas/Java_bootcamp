package Gun44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_MultipleCatch {
    public static void main(String[] args) {
        // Kullanıcıdan 5 kez 2 şer adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
        // Oluşabilecek tüm hataları try-catch ile handle ediniz.
        // Hata oluşursa yerine sayı istenecek.

        for (int i = 0; i < 5; i++){

            try {
                Scanner oku=new Scanner(System.in);
                System.out.print("1. Sayı giriniz:");
                int sayi1= oku.nextInt(); // harf ve sayı iki farklı tip girileceği için Scanner içeriye aldık

                System.out.print("2. Sayı giriniz:");
                int sayi2= oku.nextInt();

                int bolum=sayi1/sayi2;
                System.out.println("bolum = " + bolum);
            }
            catch (ArithmeticException ex){
                System.out.println("Lütfen 2. sayıya sıfır girmeyiniz");
                i--;
            }
            catch (InputMismatchException ex){
                System.out.println("Lütfen sayı giriniz.");
                i--;
            }


        }




    }
}
