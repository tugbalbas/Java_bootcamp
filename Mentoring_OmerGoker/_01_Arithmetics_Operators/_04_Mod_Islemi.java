package Mentoring_OmerGoker._01_Arithmetics_Operators;

import java.util.Scanner;

public class _04_Mod_Islemi {
      /*

              %	  Modulus	Returns the division remainder	  x % y

    */


    // SAYININ 2 YE BÖLÜMÜNDEN KALAN 1 İSE TEK, 0 İSE ÇİFT SAYIDIR.
    // Sayinin birler basamagindaki degeri bulmak icin x % 10 islemi yapilir
    // 5 % 8 gibi bir islemde modu alinan sayi kucuk ise sonuc sayinin kendisidir.
    // 0 % 3 ve 5 % 0

    // Örnek : kullanicinin girdigi üc basamakli bir sayinin sayi degerleri toplamini bulunuz

    public static void main(String[] args) {

//              Scanner scr=new Scanner(System.in);
//              System.out.println("uc basamakli bir yasi giriniz: ");
//              int sayi=scr.nextInt();// 345
//
//              int birler = sayi%10;   // 345%10 = 5
//              int onlar = (sayi/10)%10; //34%10    4
//              int yuzler = sayi/100;     // 3,45  3
//
//        System.out.println(birler+onlar+yuzler);


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir string cümle girin");
        String number = scan.nextLine();
        if (number.contains("€"))
        {System.out.println("This is euro");}
        else if (number.contains ("$"))
        {System.out.println("This is dolar"); }
        else
        {System.out.println("no money");}

    }
}
