package Mentoring_OmerGoker._01_Arithmetics_Operators;

import java.util.Scanner;

public class _02_Toplam_Cikarma {

    /*

      +	  Addition	     Adds together two values	         x + y
      -	  Subtraction	 Subtracts one value from another	 x - y

       */


    public static void main(String[] args) {

        String a = 5 + "ali";
        String b = "ali" + 5;

        //  System.out.println(10  +  20 + "EuroTech");
        System.out.println("EuroTech" + 10 + 20);


        //Örnek : Kullanicidan 1 adet INT, 2 adet de BYTE girmesini siteyiniz. İnt'dan iki byte'ın toplamini çıkarınız. Sonucu yazdırınız.
        //Scanner kullanınız.

        Scanner scr = new Scanner(System.in);
        System.out.println("bir int giriniz : ");
        int sayi1 = scr.nextInt();
        System.out.println("bir byte giriniz:");
        byte sayi2 = scr.nextByte();
        System.out.println("bir byte daha giriniz: ");
        byte sayi3 = scr.nextByte();

        System.out.println(sayi1 - (sayi2 + sayi3));


    }
}