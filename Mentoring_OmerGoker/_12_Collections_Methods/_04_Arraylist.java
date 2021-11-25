package Mentoring_OmerGoker._12_Collections_Methods;

import java.util.ArrayList;

public class _04_Arraylist {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add("Ömer");
        a.add("Hüseyin");
        a.add("Ahmet");
        a.add("Mehmet");

        b.add("Nurdan");
        b.add("Osman");
        b.add("ömer");
        b.add("Ahmet");

        a.removeAll(b);
        System.out.println(a);

    }
}
