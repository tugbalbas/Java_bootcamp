package Gun10;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız
        //435 -> 534 sayı olarak bulunuz

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayi=input.nextInt();

        int birler=sayi%10; // 5
        int onlar=(sayi/10)%10; // 3
        int yuzler=sayi/100; // 4

        int tersi=birler*100 + onlar*10 + yuzler;
        System.out.println("tersi = " + tersi);
    }
}
