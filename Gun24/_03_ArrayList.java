package Gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(55);
        rakamlar.add(45);
        rakamlar.add(35);
        rakamlar.add(25);

        System.out.println("ilk hali rakamlar = " + rakamlar);

        // Sıralama yapar
        Collections.sort(rakamlar);
        System.out.println("son hali rakamlar = " + rakamlar);

        // Tersine çevirir
        Collections.reverse(rakamlar);
        System.out.println("Tersine çevirir rakamlar = " + rakamlar);

        System.out.println("listdeki en büyük = " + Collections.max(rakamlar));
        System.out.println("listdeki en küçük = " + Collections.min(rakamlar));

        // Bütün elemanlara bir değer atama
        Collections.fill(rakamlar,8);
        System.out.println("rakamlar = " + rakamlar);

        // Belli bir değerdeki elemanları, başka bir değer atar
        Collections.replaceAll(rakamlar,8,9);
        System.out.println("rakamlar = " + rakamlar);




    }
}
