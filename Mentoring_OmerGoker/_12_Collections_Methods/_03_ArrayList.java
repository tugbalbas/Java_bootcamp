package Mentoring_OmerGoker._12_Collections_Methods;

import java.util.ArrayList;
import java.util.Collections;

public class _03_ArrayList {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        System.out.println(arrayList);

        arrayList.add(5,"a");
        arrayList.set(3,"w");
        arrayList.remove("h");
        Collections.replaceAll(arrayList,"a","x");
        Collections.reverse(arrayList);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
