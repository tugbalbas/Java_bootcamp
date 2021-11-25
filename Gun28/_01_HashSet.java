package Gun28;

import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs1=new HashSet(); // Sadece Int alabilen

        HashSet<Object> hsObject=new HashSet<>(); // Bu şekil de Object elemanları olabilir.
        HashSet hs2=new HashSet(); // bir tip vermezseniz, GENEL yani OBJECT tip olmuş olur.
        hs2.add("12");    // String de bir Object
        hs2.add(12);      // Sayı da bir Object
        hs2.add("ismet"); // String de bir Object

        HashSet<Integer> hs3=new HashSet<>(); // Sadece Integer alabilen SET tanımlandı.
        hs3.add(1);
        hs3.add(5);
        hs3.add(7);
        hs3.add(34);
        hs3.add(3);
        boolean eklendiMi= hs3.add(5); // tekrar aynı sayı eklenmek istendi sonuç ?
        boolean eklendiMi2 = hs3.add(3) ; // acaba eklendi mi ?
        boolean eklendiMi3 = hs3.add(24); // acaba eklendi mi ?

        //Ekrana yazdırma 1
        System.out.println("hs3 = " + hs3);
        System.out.println("eklendiMi (5) = " + eklendiMi);
        System.out.println("eklendiMi2 (3) = " + eklendiMi2);
        System.out.println("eklendiMi3 (24)= " + eklendiMi3);

        //Ekrana yazdırma 2
        for(Integer e : hs3)
        {
            System.out.println("e = " + e);
        }

        //Ekrana yazdırma 3
        Iterator gosterge=hs3.iterator();
        while (gosterge.hasNext())
        {
            Integer eleman = (Integer) gosterge.next();

            if (eleman == 34)
                gosterge.remove();
        }

        System.out.println("34 remove sonrası hs3 = " + hs3);

        hs3.remove(5);
        System.out.println("5 remove sonrası hs3 = " + hs3);

        if (hs3.contains(5))
            System.out.println("5 var");
        else
            System.out.println("5 yok");

        hs3.clear();
        System.out.println("Clear sonrası hs3 = " + hs3);

    }

}

//        hs3 = [1, 34, 3, 5, 7, 24]
//        eklendiMi (5) = false
//        eklendiMi2 (3) = false
//        eklendiMi3 (24)= true
//        e = 1
//        e = 34
//        e = 3
//        e = 5
//        e = 7
//        e = 24
//        34 remove sonrası hs3 = [1, 3, 5, 7, 24]
//        5 remove sonrası hs3 = [1, 3, 7, 24]
//        5 yok
//        Clear sonrası hs3 = []