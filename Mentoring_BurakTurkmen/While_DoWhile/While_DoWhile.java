package Mentoring_BurakTurkmen.While_DoWhile;

import java.util.Scanner;

public class While_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen PIN kodunuzu giriniz: ");
        int userPin=scan.nextInt();

        int pinCode=5555;
        while (userPin != pinCode){
            System.out.println("------- Yanlış PIN");
            System.out.println("Tekrar deneyiniz");
            userPin=scan.nextInt();
        }
        System.out.println("Başarıyla giriş yapıldı");
    }
}
