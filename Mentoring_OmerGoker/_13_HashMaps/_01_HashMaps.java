package Mentoring_OmerGoker._13_HashMaps;

import java.util.HashMap;

public class _01_HashMaps {
    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<>(); // tanımlama

        //             Key            Value
              map.put("Amazon",      "296 Euro");
              map.put("Ebay",        "278 Euro");
              map.put("Saturn",      "300 Euro");
              map.put("MediaMarkt" , "310 Euro");
              map.put("Apple Store", "340 Euro");

        System.out.println(map); // Hashset gibi kendi algoritmesına göre yazdırıyor



        //  ******************** Hashmap .size() methodu *************************

        System.out.println("map.size() = " + map.size());

        //  *****************  Hashmap kopyalama yolları  ***********************

        HashMap<String ,String > map2=new HashMap<>();
//        map2=new HashMap<>(map); // içine yazarak kopyalayabiliyoruz
//        System.out.println("map2 = " + map2);

        map2.putAll(map); // 2. yöntem
        System.out.println("map2 = " + map2);



        //todo    **************** Hashmap boşaltma .clear **************************

//                map.clear();
//        System.out.println("clear dan sonra : "+ map);
//
//        System.out.println(map.isEmpty());



        //******************* Hashmap .containsKey *****************************

        String magaza="Saturn";

        if (map.containsKey(magaza)){
            System.out.println("map = " + map.get(magaza));
        }else {
            System.out.println("bu mapte böyle bir mağaza yoktur");
        }
        System.out.println(map.containsKey("Saturn1"));

        // ******************* Hashmap .containsValue *****************************


        String fiyat = "310 Euro";

        if (map.containsValue(fiyat)){

            System.out.println("bu fiyatta bir satici bulundu");

        }else
        {

            System.out.println("bu fiyatta bir satici bulunamadi");
        }

        System.out.println(map.containsValue("310 Euro"));



        // ******************* Hashmap .get  Spesifik bir Key'i elde etmemize yarıyor *****************************

        System.out.println(map.get("Saturn"));




        // *******************  Hashmap Keys ve Values yazdırma.  *****************************

        System.out.println(map.keySet());
        System.out.println(map.values());




    }
}

