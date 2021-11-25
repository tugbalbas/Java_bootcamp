package Gun07;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcı adını ve soyadını ayrı ayrı okutarak alıp birlikte ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı giriniz:");
        String ad = input.nextLine();

        System.out.println("Soyadınızı giriniz:");
        String soyad = input.nextLine();

        System.out.println("Adınız ve soyadınız: " + ad +" "+ soyad);
    }
}
