package Mentoring_OmerGoker._11_ArrayList;

import java.util.ArrayList;

public class _01_ArrayList {


    public static void main(String[] args) {


          String [] arr = new String[5];


          ArrayList<String> strlist = new ArrayList<>();
          ArrayList<Integer> intlist = new ArrayList<>();
          ArrayList<Boolean> bollist = new ArrayList<>();



     //   System.out.println("----                ELEMAN EKLEME                  ------ \n ");

           strlist.add("ömer");
           strlist.add("ahmet");

           strlist.add("ayse");
           strlist.add("fatma");
           strlist.add("mehmet");

        System.out.println(strlist);

            intlist.add(12);
            intlist.add(15);
            intlist.add(18);
            intlist.add(32);
            intlist.add(9);

        for (String n: strlist) {

            System.out.println(n);
        }

        //belli bir indekse eleman eklman
        strlist.add(2,"Murat");
        System.out.println(strlist);

//        strlist.add(7,"mustafa");
//        System.out.println(strlist);

        System.out.println(" \n  \n ----------                ARRAYLİST'İN UZUNLUĞUNU BULMA      ---------   \n" );

        System.out.println(strlist);
        System.out.println("lstin uzunlugu: "+ strlist.size());



       System.out.println(" \n ----------                INDEKSTEKİ ELEMANI ÇAĞIRMA      ---------   \n" );

        System.out.println(strlist.get(0).length());

        System.out.println(intlist.get(2));

       System.out.println(" \n ----------             INDEKSTEKİ ELEMANI DEĞİŞTİRME      ---------   \n" );


         strlist.set(3,"özkan");
        System.out.println(strlist);

        intlist.set(2,99);
        System.out.println(intlist);

        strlist.set(3,strlist.get(1));
        System.out.println(strlist);

    //    System.out.println(" \n ----------           ELEMANI SILME      ---------   \n" );

           strlist.remove("ahmet");
        System.out.println(strlist);

        strlist.remove(2);
        System.out.println(strlist);

      //  intlist.remove(3);


        ArrayList<Integer> intlist2 =new ArrayList<>();
        intlist2.add(12);
        intlist2.add(15);
        intlist2.add(9);
        System.out.println(intlist.removeAll(intlist2));
        System.out.println(intlist);



        System.out.println(" \n ----------          Array List'in boş olup olmadığını check etme -- Listeyi temizleme     ---------   \n" );

        System.out.println(strlist.isEmpty());

          intlist2.clear();
        System.out.println(intlist2);
        System.out.println(intlist2.isEmpty());



       System.out.println(" \n ----------              BİR ELEMANIN İNDEKSİNİ BULMA     ---------   \n" );

        System.out.println(intlist);

        System.out.println(intlist.indexOf(32));



    //    System.out.println(" \n ----------              CONTAINS / CONTAINSALL    ---------   \n" );

        System.out.println(strlist);
        System.out.println(strlist.contains("fatma"));
        System.out.println(intlist.contains(2));


        ArrayList<String> stringliste=new ArrayList<>();

        stringliste.add("ömer");
        stringliste.add("atma");
        System.out.println(stringliste);

        System.out.println(strlist.containsAll(stringliste));





    }
}
