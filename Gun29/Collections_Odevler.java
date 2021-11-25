package Gun29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collections_Odevler {

    public static void main(String[] args) {

        Map<String, Integer> hm=new HashMap<>();
        hm.put("Lion",1);
        hm.put("Tiger",2);
        hm.put("Elephant",3);
        hm.put("Cat",4);
        hm.put("Dog",5);
        System.out.println(returnKey(hm));



    }
//    map1() isminde bir method oluşturun.
//    Parametresi   bir Integer -String map  ve bir int
//    return tipi String
//    Tamsayı değerlerini (int) döndürün.
//    ÖRNEK:
//    Map:
//            1 ,  "Lion"
//            2 ,  "Tiger"
//            **3 ,  "Elephant"**
//            4 ,  "Cat"
//            5  , "Dog"
//            **Integer 3**
//    Cevap **Elephant** olmalı.

    //1-
    public static String map1(Map<Integer,String>map, int sayi){
        String text="";
        text=map.get(sayi);
        return text;
    }


//2-
//    returnKey() isminde bir method oluşturun.
//    Parametresi     String-Integer HashMap olsun.
//    Return tipi Array List olsun.
//            Hashmap:
//            "Lion",     1
//            "Tiger",    2
//            "Elephant", 3
//            "Cat",      4
//            "Dog",      5
//Tüm **ANAHTARLARI(Keys)** for döngüsü ile döndürün.

    //2-
    public static ArrayList<String>returnKey(Map<String,Integer>map){
        ArrayList<String>arrayList=new ArrayList<>();
        for ( String str: map.keySet()) { // keyset: anahtar listesi
            arrayList.add(str);
        }
        return arrayList;
    }

//3- ismi **returnValue()** olan bir method oluşturun.
//    Parametresi    **String-Integer HashMap**
//    Return tipi ArrayList
//    Bir Hashmap oluşturun ve değerleri Integer ve String'lerden oluşmalı.
//    Map
//"Lion",         1
//        "Tiger",        2
//        "Elephant",  3
//        "Cat",          4
//        "Dog",         5
//    Tüm **_DEĞERLERİ_** (values) **for döngüsü** ile döndürün.

    public static ArrayList<Integer>returnValue(Map<String, Integer> map){
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (Integer i : map.values()){
            arrayList.add(i);
        }
        return arrayList;
    }

}
