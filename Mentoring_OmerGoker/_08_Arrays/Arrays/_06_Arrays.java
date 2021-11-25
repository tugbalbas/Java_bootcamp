package Mentoring_OmerGoker._08_Arrays.Arrays;

import javax.swing.*;

public class _06_Arrays {


    public static void main(String[] args) {
        //Sayiyi tersten yazdirma
        int sayi= 12345;

        String strsayi = String.valueOf(12345);

        String tersi="";

        String [] dizisayi=strsayi.split("");

        for (int i = dizisayi.length-1; i >=0 ; i--) {
            tersi += ""+dizisayi[i];
        }
        System.out.println(tersi);
    }
  
}
