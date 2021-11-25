package Gun08;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan tek okumada alacağınız 2 kelimelik ad ve soyadı
        // -> "Adınız ve Soyadınızı giriniz.")
        // ekrana ilk harfleri ve nokta şekl. yazdırınız.
        //Örnek Tuğba Albaş -> T.A.

        Scanner oku = new Scanner(System.in);
        System.out.println("Adınızı ve Soyadınızı giriniz.");
        String adSoyad=oku.nextLine();

        char adIlkHarf = adSoyad.charAt(0);
        int boslukNerede = adSoyad.indexOf(" "); // bu indexin 1 fazlası her zaman soyadın ilk harfidir.
        char soyadIlkHarf = adSoyad.charAt(boslukNerede+1);

        System.out.println(adIlkHarf+"."+soyadIlkHarf+".");
    }
}
