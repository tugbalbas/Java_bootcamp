package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet;

import java.util.*;

public class HashSet_6 {
    public static void main(String[] args) {

        Integer[] dizi=new Integer[] {1,3,5,7,9};

        HashSet<Integer> hsInt = new HashSet<>(Arrays.asList(dizi));

        HashSet<Integer> hsInt2 = new HashSet<>(Arrays.asList(12,23,34,45,56));

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(56,45,89,11,91,34));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(56,45,89,11,91,34));

        System.out.println(hsInt);
        System.out.println("---------");
        System.out.println(hsInt2);
        System.out.println("---------");
        System.out.println(treeSet);
        System.out.println("---------");
        System.out.println(linkedHashSet);


    }
}
