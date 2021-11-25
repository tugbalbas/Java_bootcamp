package Gun10;

import java.util.Scanner;

public class _09_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayını tek mi çift mi old yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();

        if (sayi%2 ==1)
            System.out.println("Sayı tektir");
        if (sayi%2==0)
            System.out.println("Sayı çifttir");

    }
}
