package Gun07;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam saının toplamını ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayı giriniz: "); int sayi1 = input.nextInt();

        System.out.println("2. sayı giriniz"); int sayi2 = input.nextInt();

        // 1. Yöntem
        int toplam=sayi1+sayi2;
        System.out.println("Girilen iki sayının toplamı= " + toplam);

        //2. yöntem
        System.out.println("Toplam= " + (sayi1+sayi2));

        // çalışmayan yöntem
        System.out.println("toplam " + sayi1 + sayi2); // rakamları yan yana string olarak toplar
        // burada string ile sayı toplandığından
        // println hepsini stringe çevirip yanyana ekler, sayı toplaması yapmaz
    }
}
