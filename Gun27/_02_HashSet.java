package Gun27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _02_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("rED");

        //1. Yöntem ekrana yazdırma
        System.out.println("renkler = " + renkler);

        //2. Yöntem ekrana yazdırma
        for (String s: renkler) {
            System.out.println("renkler = " + s);
        }

        //3. Yöntem
//      Iterator, elemanlar arası istenilen yönde ilerlemek için kullanılır.
        Iterator gosterge= renkler.iterator(); // renkler isimli dizinin başına konumlanıyor

        while (gosterge.hasNext()){ // Sonraki eleman var ise
//            System.out.println("Sonraki eleman = " + gosterge.next()); // sıradaki elemanı gösterir

            if (gosterge.next() == "Blue")
                gosterge.remove(); // o anda gösterdiği elemanı silebiliyor
        }

        renkler.remove("Red"); // bir eleman siler
        System.out.println("Red remove sonrası = " + renkler);

        renkler.clear(); // Seti temizler
        System.out.println("clear sonrası = " + renkler);
        
    }
}
