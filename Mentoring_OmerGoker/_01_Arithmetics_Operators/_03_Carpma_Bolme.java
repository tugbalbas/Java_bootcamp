package Mentoring_OmerGoker._01_Arithmetics_Operators;

import java.util.Scanner;

public class _03_Carpma_Bolme {

    /*

    *	Multiplication	Multiplies two values	        x * y
    /	Division	    Divides one value by another	x / y



 */


    public static void main(String[] args) {

        System.out.println(10*20 + "EuroTech");
        System.out.println("EuroTech" + 10 * 20);


        //Örnek: Kullanicidan 3 adet DOUBLE girmesini siteyiniz. İlk iki sayiyi carpip ücücncü sayiya böldürünüz. Sonucu yazdırınız.
        //Scanner kullanınız.

        Scanner scr = new Scanner(System.in);
        System.out.println("bir double giriniz : ");
        double sayi1 = scr.nextDouble();
        System.out.println("bir double giriniz : ");
        double sayi2 = scr.nextDouble();
        System.out.println("bir double giriniz : ");
        double sayi3 = scr.nextDouble();
        System.out.println((sayi1 * sayi2) / sayi3);


    }
}