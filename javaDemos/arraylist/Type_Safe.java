package javaDemos.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Type_Safe {
    public static void main(String[] args) {
        ArrayList<String > sehirler = new ArrayList<>();
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Ankara");
        
        sehirler.remove("Ankara");
        Collections.sort(sehirler);
        for (String sehir:sehirler) {
            System.out.println("sehir = " + sehir);
        }

    }
}
