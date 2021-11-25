package Mentoring_OmerGoker._08_Arrays.Arrays;

import java.util.Arrays;

public class _04_Arrays {


    public static void main(String[] args) {

        //10 elemanli bir int array tanimlayip 100 e kadar olan degerlerle random olarak dolduralim
        //arrayin elemanlarinin toplamini ve ortalamasini bulalim.

          int [] arr = new int[10];

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=(int) (Math.random()*100);
        }

        System.out.println(Arrays.toString(arr));
        int toplam=0;
        int ort=0;

        for (int i = 0; i <arr.length ; i++) {

            toplam+=arr[i];

        }

        ort=toplam/arr.length;

        System.out.println(toplam);
        System.out.println(ort);

    }
}
