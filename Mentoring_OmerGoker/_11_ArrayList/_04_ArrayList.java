package Mentoring_OmerGoker._11_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class _04_ArrayList {

    public static void main(String[] args) {

/*
İki adet Integer ArrayList oluşturun.
RandomEkle metodu listeleri 0 dan 20 ye kadar olan  6 rastgele sayi ile  doldursun
OrtakElemaniBul metodu iki list arasindaki ortak elemanlari bulup bir liste halinde geri dondursun
OrtakElemanCikart metodu ilk listeden ikinci listenin elemanlarini cikartsin
ve liste olarak geri dondursun.
 */


        ArrayList<Integer> arrlist1= new ArrayList<>();
        ArrayList<Integer> arrlist2= new ArrayList<>();

        arrlist1= randomEkle(arrlist1);
        arrlist2= randomEkle(arrlist2);

        System.out.println(arrlist1);
        System.out.println(arrlist2);

        System.out.println(ortakElemaniBul(arrlist1,arrlist2));

        System.out.println(ortakElemanCikart(arrlist1,arrlist2));


    }
    public static ArrayList<Integer> randomEkle(ArrayList<Integer> arr){

        for (int i = 0; i <6 ; i++) {

            arr.add((int)(Math.random()*20+1));
        }

        return arr;
    }


    public static ArrayList<Integer> ortakElemaniBul(ArrayList<Integer> a,ArrayList<Integer> b){

        ArrayList<Integer> x =new ArrayList<>();
        // retainAll
        x.addAll(a);
        x.retainAll(b);
        return x;
    }

   public static ArrayList<Integer> ortakElemanCikart(ArrayList<Integer> a,ArrayList<Integer> b){
       ArrayList<Integer> y =new ArrayList<>();
        y.addAll(a);
        y.removeAll(b);

       return y;
   }

}


