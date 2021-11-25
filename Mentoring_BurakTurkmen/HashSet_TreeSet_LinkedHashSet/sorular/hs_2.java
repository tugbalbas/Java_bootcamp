package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet.sorular;

import java.util.*;

public class hs_2 {
    public static void main(String[] args) {
        // HashSet, TreeSet, LinkedHashSet oluşturunuz ve elemanlarını yazdırınız
        // Elemanları ismi generateNumbers olan, return type ı ise ArrayList olan bir methoddan alınız
        // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

        ArrayList<Integer> list= generateNumbers();

        HashSet<Integer> hashSet=new HashSet<>(list);
        System.out.println("hashSet: " + hashSet);

        TreeSet<Integer> treeSet=new TreeSet<>(list);
        System.out.println("treeSet: " + treeSet);

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(list);
        System.out.println("linkedHashSet: " + linkedHashSet);
    }
    public static ArrayList<Integer> generateNumbers(){
        ArrayList<Integer> result= new ArrayList<>();

        int[] numbers={1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
        for ( int number : numbers) {
            result.add(number);
        }
        return result;
    }
}
