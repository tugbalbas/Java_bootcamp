package Gun12;

import java.util.Scanner;

public class _02_TernaryOperator {
    public static void main(String[] args) {
        // Soru: Girilen sayı 50den büyük ise 1, değilse 0 değerini ekrana yazdırınız
        // Ternary operator ile yapınız

        Scanner input = new Scanner(System.in);
        System.out.print("sayi: ");
        int sayi = input.nextInt();

        int sonuc = (sayi > 50 ? 1 : 0);

        System.out.println(sonuc); // 1. yöntem
        System.out.println("sonuc=" + (sayi > 50 ? 1 : 0)); // 2. yöntem
    }
}
