package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet;

import java.util.HashSet;

public class HashSet_3 {
    public static void main(String[] args) {

        HashSet<String> hs1=new HashSet<>();

        hs1.add("Burak");
        hs1.add("Ömer");
        hs1.add("Fatih");

        System.out.println(hs1);
        System.out.println("---------");

        hs1.clear();
        System.out.println(hs1);
    }
}
