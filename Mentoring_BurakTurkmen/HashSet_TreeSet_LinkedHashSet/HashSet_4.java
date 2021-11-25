package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet;

import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {

        HashSet<String> hs1=new HashSet<>();

        hs1.add("Burak");
        hs1.add("Ömer");
        hs1.add("Fatih");

        System.out.println(hs1);
        System.out.println("---------");
        // INDEX DEĞİL OBJECT
        if (hs1.remove("Ömer")){
            System.out.println("Silindi");
        }else
        System.out.println("Böyle bir veri yok");

        System.out.println("---------");
        System.out.println(hs1);
    }
}
