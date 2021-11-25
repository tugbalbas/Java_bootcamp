package _15_Non_AccessModifiers.Static;

 /*
     todo
        Static Initilization block
        Static kod bloklari static degiskenler iliskin ilk deger atamalarini yapamak icin kullanilir



     */

import java.util.Arrays;
import java.util.Random;

public class Static_Kod_Blogu {

   private static int dizi[];
   private static int boy=10;


   static {

       System.out.println("static kod blogu calisti");
            dizi=new int[boy];
            Random rnd=new  Random();

       for (int i = 0; i <boy ; i++) {

           dizi[i]=rnd.nextInt(10);  //0 1 2 .9
       }


   }


    public static void main(String[] args) {
        System.out.println("class calisti");
        System.out.println(Arrays.toString(Static_Kod_Blogu.dizi));
    }

}




