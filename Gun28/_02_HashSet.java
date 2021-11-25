package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class _02_HashSet {
    public static void main(String[] args) {
        Integer[] dizi = new Integer[]{1, 2, 3, 4, 5, 5}; //bir dizi tanımladık

        HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(dizi)); // diziyi SET e atıyor

        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("hs1 = " + hs1);
        System.out.println("hs2 = " + hs2);

        // Ortak elemanları bulma : kesişim
        HashSet<Integer> hsKesisim = new HashSet<>(hs1); // hs 1 eşitlendi
        hsKesisim.retainAll(hs2); // ortak elemanları
        System.out.println("hsKesisim = " + hsKesisim);

        //Farkını bulma
        HashSet<Integer> hsFark = new HashSet<>();
        hsFark.addAll(hs1); // hs1 hsFark a eklenmiş oldu.
        hsFark.removeAll(hs2); // Farkı bulunmuş oldu.
        System.out.println("hsFark = " + hsFark);
    }
}
//        hs1 = [1, 2, 3, 4, 5]
//        hs2 = [4, 5, 6, 7, 8]
//        hsKesisim = [4, 5]
//        hsFark = [1, 2, 3]