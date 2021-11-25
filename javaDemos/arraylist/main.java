package javaDemos.arraylist;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*
        
        int[] sayilar = new int[]{1,2,3};
//        sayilar[3]=4; // ArrayIndexOutOfBoundsException bunu aşmak için
        sayilar = new int[4]; // dizimiz değişti
        System.out.println("sayilar[0]: "+sayilar[0]);
        
         */

        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
//        System.out.println("sayilar.size() = " + sayilar.size());
//        System.out.println("sayilar.get(2) = " + sayilar.get(2));
//        sayilar.set(0,100); // eleman güncelleme
//        System.out.println("sayilar.get(0) = " + sayilar.get(0));
//
//        sayilar.remove(0); // siliniyor ve sola doğru kayıyor
//        System.out.println(sayilar.get(1));
//
//        sayilar.clear();

        for (Object i: sayilar) {
            System.out.println("i = " + i);
        }



    }
}
