package Mentoring_OmerGoker._11_ArrayList;

import java.util.ArrayList;

public class _02_ArrayList {

//    String arrayList oluşturun.
//    İçerisine Almanya, Italya , Türkiye , Yunanistan , Kanada ekleyin.
//    reverse   adında  void bir method oluşturun ve parametresi   String arrayList olsun.
//    Bu method, arrayListteki değerleri tersten sıralasın ve yazdırsın.

//    Konsoldaki görüntü böyle olmalı:
//    ilk hali :   [Almanya, İtalya, Türkiye, Yunanistan, Kanada]
//    Tersten hali :   [Kanada, Yunanistan, Türkiye, İtalya, Almanya]
public static void main(String[] args) {


           ArrayList<String> ulkeler= new ArrayList<>();

           ulkeler.add("Almanya");
           ulkeler.add("Italya");
           ulkeler.add("Türkiye");
           ulkeler.add("Yunanistan");
           ulkeler.add("Kanada");

    System.out.println(ulkeler);
          reverse(ulkeler);

}
public static void reverse(ArrayList<String> ulke){

    ArrayList<String> tersi= new ArrayList<>();

    for (int i =ulke.size()-1 ; i >=0 ; i--) {
        tersi.add(ulke.get(i));
    }
    System.out.println(tersi);

}


    }



