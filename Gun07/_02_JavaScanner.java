package Gun07;

import java.util.Scanner;

public class _02_JavaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input ismine bir okuyucu tanımlandı, Klavyeden giriş yapmak üzere(System.in)
        System.out.print("Bir sayı giriniz:");
        int sayi= input.nextInt();
        // oku.nextInt() ekrandan sayıyı aldı ve bizde sayı değişkenine attık

        System.out.println("Girilen sayi = " + sayi);
    }
}
