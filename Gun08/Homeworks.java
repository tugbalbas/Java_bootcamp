package Gun08;

import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
//        1- Create a string which is city where you live
//        Create a String which is you born.
//        Verify first string equal to second string or not.
//
//        2- Create a String which is INLINE CODE
//        Create a String which is inline CODE
//        verify is the first is equal to  second string
//
//        3- Create a String which is INLINE CODE
//        Create a String which is inline CODE
//        verify is the first is equal to second string
//        Note: ignore the case upper case or lower case
//
//       4-  Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,  ad ayrı soyad ayrı şekilde ekrana yazdırınız.
//
//        5-  Kullanıcıdan alacağınız 3 kelimelik ismin her kelimesini ayırarak ayrı ayrı yazdırınız. Örn: Ahmet Emin Yıldız
//
//        6-  Kullanıcıdan alacağını bir stringde boşulk karakterinin olup olmadığını kontrol ediniz.
//
//        7-  Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi  Örn. Ahmet Emin Yılmaz -> A.E.Y. formatıyla yazdırınız.

        String str1="İstanbul";
        String str2="İzmir";
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        Scanner scan=new Scanner(System.in);
        System.out.print("First string: ");
        String text2 = scan.nextLine();
        System.out.print("Second string: ");
        String text3 = scan.nextLine();
        System.out.println("text2.equals(text3) = " + text2.equals(text3));

        Scanner input=new Scanner(System.in);
        System.out.print("Third string:");
        String str3=input.nextLine();
        System.out.print("Fourth string:");
        String str4=input.nextLine();
        System.out.println("str3.equalsIgnoreCase(str4) = " + str3.equalsIgnoreCase(str4));

        Scanner scan2=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz:");
        String adSoyad=scan2.nextLine();
        int boslukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        String soyad=adSoyad.substring(boslukIndex+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        Scanner scan3=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz:");
        String adSoyad2=scan3.nextLine();
        int ilkBoslukIndex=adSoyad2.indexOf(" ");
        int sonBoslukIndex=adSoyad2.lastIndexOf(" ");
        String isim=adSoyad2.substring(0,ilkBoslukIndex);
        String ad2=adSoyad2.substring(ilkBoslukIndex+1,sonBoslukIndex);
        String soyad2=adSoyad2.substring(sonBoslukIndex+1);
        System.out.println("ad = " + isim);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad2 = " + soyad2);

        Scanner input2=new Scanner(System.in);
        System.out.print("string giriniz: ");
        String text=input2.nextLine();
        System.out.println("text = " + text.contains(" "));

        Scanner input3=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz:");
        String tamAd=input3.nextLine();
        char ilk=tamAd.charAt(0);
        char iki = tamAd.charAt(tamAd.indexOf(" ")+1 );
        char soy = tamAd.charAt(tamAd.lastIndexOf(" ")+1 );
        System.out.println(ilk+"."+iki+"."+soy+".");








    }
}
