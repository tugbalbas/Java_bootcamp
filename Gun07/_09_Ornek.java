package Gun07;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak, PostaKodu(int) ve ğlke şeklinde adres bilgisi alarak yazdırınız

        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Cadde adı:");
        String cadde = input.nextLine();
        System.out.println("Sokak adı:");
        String sokak = input.nextLine();
        System.out.println("Posta kodu:");
        int pkodu=scan.nextInt();
        System.out.println("Ülke:");
        String ulke=input.nextLine();

        System.out.println("Adres bilgisi: " + cadde +" "+ sokak +" "+ pkodu +" " + ulke);
    }
}
