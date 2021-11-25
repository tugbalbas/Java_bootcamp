package Pazar_Grup_Calismasi;

import java.util.Arrays;
import java.util.Scanner;

public class Method_3 {
    //       0 ile kullanıcının gireceği sayı arası random sayılarla diziyi dolduran bir metod yazın. diziyi return edin.
//        kac tane sayi oldugunu return eden  methodu yazdiriniz
//        --> kac tane tek sayi oldugunu return eden methodu yazdiriniz
//        --> kac tane cift sayi oldugunu return eden methodu yazdiriniz
//        -->en buyuk sayi
//        -->en kucuk sayi

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi=sc.nextInt();

        int[] sonuc=rtnMethod(sayi);

        System.out.println(Arrays.toString(sonuc));
    }



    public static int[] rtnMethod(int sayi) {

        int[]dizi=new int[sayi];

        for (int i = 0; i < sayi; i++) {
            dizi[i]=(int) (Math.random()*sayi);
        }

        return dizi;

    }
}
