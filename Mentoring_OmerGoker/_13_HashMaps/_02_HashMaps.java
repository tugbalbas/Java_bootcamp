package Mentoring_OmerGoker._13_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class _02_HashMaps {
    public static void main(String[] args) {


        // **************** Hashmap Alt alta Value yazdırma ************************

        HashMap<String,String> map = new HashMap<>();

        //             Key            Value
        map.put("Amazon",        "296 Euro");
        map.put("Ebay",          "278 Euro");
        map.put("Saturn",        "300 Euro");
        map.put("Mediamarkt",    "310 Euro");
        map.put("Apple Store",   "340 Euro");

        System.out.println(map);


//        Önce sete çevviriyor, entry e atıp map e çeviriyor
        for (Map.Entry<String,String> entry: map.entrySet()) {

            String  key = entry.getKey();
            System.out.println(key);
            String value = entry.getValue();
            System.out.println(value);


            if (key.contains("Saturn")){ // value değiştirme

                entry.setValue("100 Euro");
            }
            //   entry.setValue("100 Euro");


        }

        System.out.println(map.values());






    }
}
