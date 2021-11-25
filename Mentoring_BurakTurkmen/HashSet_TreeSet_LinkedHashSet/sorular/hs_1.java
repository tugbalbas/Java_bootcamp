package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet.sorular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hs_1 {
    public static void main(String[] args) {
        // HashSet, TreeSet, LinkedHashSet oluşturunuz ve elemanlarını yazdırınız
        // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

        HashSet<Integer> hashSet=new HashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6));
        TreeSet<Integer> treeSet=new TreeSet<>(hashSet); // ya da yukardaki gibi
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(hashSet); // ya da yukardaki gibi

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);
    }
}
