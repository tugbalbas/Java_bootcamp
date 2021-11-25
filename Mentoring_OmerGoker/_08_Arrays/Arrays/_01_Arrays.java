package Mentoring_OmerGoker._08_Arrays.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Arrays {
    public static void main(String[] args) {

        // Belli verileri depoladigimiz bir liste(yigin) gibi dusunebiliriz

        /* ====================================================================================================    */
        int a = 2;// tek degiskenle sadece tek deger tanimliyoruz

        int [] arr = new int[5];

          //  0    1       2      3        4
          //  11  55      66     77     88
        arr[0] = 11;
        arr[1] = 55;
        arr[2] = 66;
        arr[3] = 77;
        arr[4] = 88;
       // arr[5] = 99;
      //  System.out.println(arr[5]);
       //  arr =new int[7];
      //  System.out.println(arr[2]);
        /* ====================================================================================================    */
        //Arrayi farkli yazma
         int [] b = {2,3,4,5,6,7};
        System.out.println(b[3]);
      //  System.out.println(b[11]);

        /* ====================================================================================================    */
         //ArrayIndexOutOfBoundsException



        /* ====================================================================================================    */

        // cift sayilar sayilar arrayi

           int [] rakamlar= new int[10];

        for (int i = 0; i <10 ; i++) {

            rakamlar[i]=2*i;

        }

        System.out.println(Arrays.toString(rakamlar));




    }



}
