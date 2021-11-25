package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSet_1 {
    public static void main(String[] args) {
        // Hashset = Küme
        // Değerlerin giriiş sırası yoktur. index yoktur.
        // Aynı değerleri birden fazla yazmaz.
        // Sadece bir null değer alabilir.

        //LinkedHashset                 TreeSet
        //Giriş sırasına dikkat.        -Alfabetik yada küçükten büyüğe doğru sıralar.

        //Arraylarde aynı elemanı birden fazla yazabiliriz.
        //Arraylerde index vardır.

        HashSet<String> set=new HashSet<>();

        set.add("Kartal");
        set.add("Yılan");
        set.add("Tavşan");
        set.add("Çekirge");
        set.add("Yaprak");
        set.add("Su");

        System.out.println("set ---------> " + set);
        System.out.println("--------------------------");

        TreeSet<String> treeSet=new TreeSet<>();
        //ALFABETİK SIRAYA GÖRE YAZACAK.
        treeSet.add("Kartal");
        treeSet.add("Yılan");
        treeSet.add("Tavşan");
        treeSet.add("Cekirge");
        treeSet.add("Yaprak");
        treeSet.add("Su");

        System.out.println("Treeset ---------> " + treeSet);

        System.out.println("--------------------------");

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        //GİRİŞ SIRASINA GÖRE YAZACAK.
        linkedHashSet.add("Kartal");
        linkedHashSet.add("Yılan");
        linkedHashSet.add("Tavşan");
        linkedHashSet.add("Cekirge");
        linkedHashSet.add("Yaprak");
        linkedHashSet.add("Su");

        System.out.println("LinkedHashSet ---------> " + linkedHashSet);

    }
}
