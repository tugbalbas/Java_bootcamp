package Gun29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMap {
    public static void main(String[] args) {
        // HashMap, LinkedHashMap, TreeMap

        // HashMap: hızlı işlem için kendine göre bir sırada bekler
        Map<Integer, String> hm=new HashMap<>();
        hm.put(9,"fox");
        hm.put(2,"cat");
        hm.put(30,"dog");
        hm.put(4,"swan");
        hm.put(7,"bear");
        hm.put(11,"snake");

        System.out.println("hm = " + hm); // hm = {2=cat, 4=swan, 7=bear, 9=fox, 11=snake, 30=dog}

        // LinkedHashMap: Eklenme sırasına göre saklar
        Map<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(9,"fox");
        lhm.put(2,"cat");
        lhm.put(30,"dog");
        lhm.put(4,"swan");
        lhm.put(7,"bear");
        lhm.put(11,"snake");

        System.out.println("lhm = " + lhm); // lhm = {9=fox, 2=cat, 30=dog, 4=swan, 7=bear, 11=snake}

        // TreeMap: Her zaman KEYlere göre sıralı saklar
        Map<Integer, String> tm = new TreeMap<>();
        tm.put(9,"fox");
        tm.put(2,"cat");
        tm.put(30,"dog");
        tm.put(4,"swan");
        tm.put(7,"bear");
        tm.put(11,"snake");

        System.out.println("tm = " + tm); // tm = {2=cat, 4=swan, 7=bear, 9=fox, 11=snake, 30=dog}

    }
}
