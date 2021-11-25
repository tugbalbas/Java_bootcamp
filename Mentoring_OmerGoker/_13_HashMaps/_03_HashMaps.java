package Mentoring_OmerGoker._13_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class _03_HashMaps {
    public static void main(String[] args) {


        //  ********  Hashmap bir satıra Key'leri diğer satıra Value'ları yazdırma *****************

        HashMap<String,Integer> map = new HashMap<>();

        //             Key            Value
        map.put("Amazon",        296 );
        map.put("Ebay",          278 );
        map.put("Saturn",        300 );
        map.put("Mediamarkt",    310 );
        map.put("Apple Store",   340 );

        System.out.println(map);


        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }


// elemanları ayrı ayrı dolaşmak

    }


}
