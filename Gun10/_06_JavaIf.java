package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız
        // Algoritma
        // Başla
        // Sayı oku
        // Sayı > 10 => 10 dan büyük yaz
        // DUR
        Scanner input = new Scanner(System.in);
        System.out.println("Bir saı giriniz:");
        int sayi=input.nextInt();

        if (sayi > 10){ // şart sağlanıyorsa parantezlerin arasını çalıştır değilse geç
            System.out.println("10 dan büyük");
        }
    }
}
