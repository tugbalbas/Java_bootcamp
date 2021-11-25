package Mentoring_OmerGoker._10_Methods;

import java.util.Scanner;

public class _03_Method {

    //Atiba Hutchinson gibi aldiginiz ismi
    //A. H. seklinde yazan metodu yaziniz
    // ödev A### H#######
    public static void main(String[] args) {

         Scanner scr=new Scanner(System.in);
        System.out.print("isim ve soyisim giriniz : ");
        String ad_soyad=scr.nextLine();

        ad_soyad_sifrele(ad_soyad);



    }
    public static void ad_soyad_sifrele(String isim_soyisim){

        String [] strarr=isim_soyisim.split(" ");
        String sifreli = "";

        for (String a: strarr) {
            sifreli+=a.substring(0,1).toUpperCase()+". ";
        }

        System.out.println(sifreli.trim());
    }


}
