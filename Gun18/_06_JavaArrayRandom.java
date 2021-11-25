package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaArrayRandom {
    public static void main(String[] args) {
        // 5 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz.Sonrasınd aayrı bir döngü ile yazdırınız.

        int[] dizi=new int[5];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 10)+1; // 10 dahilde '+1'
        }

        // Ekrana yazdırma 1. yöntem
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi[i] = " + dizi[i]);
        }

        //Ekrana yazdırma 2. yöntem
        System.out.println(Arrays.toString(dizi));

        // Ekrana yazdırma 3. yöntem: Dizi değişkeninin içindeki elemanları değer adını vererek
        // döngüye gönderiyor.

        for (int deger: dizi){
            System.out.println("deger = " + deger);
        }
        for (int eleman: dizi){ // bu da bir yazdırma türüdür.
            System.out.println("eleman = " + eleman);
        }

    }
}
