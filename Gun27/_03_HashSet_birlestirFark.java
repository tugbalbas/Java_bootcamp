package Gun27;

import java.util.HashSet;
import java.util.Iterator;

public class _03_HashSet_birlestirFark {
    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("birlesik hali = " + birlestir(setA,setB));
        System.out.println("Farkı = " + farki(setA,setB));
        System.out.println("ortakElemanlar = " + ortakElemanlar(setA,setB));
    }

    public static HashSet<Integer> birlestir(HashSet<Integer> setA, HashSet<Integer> setB)
    {
        HashSet<Integer> birlesikHali=new HashSet<>();

        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);

        return birlesikHali;
    }

    public static HashSet<Integer> farki(HashSet<Integer> setA, HashSet<Integer> setB)
    {
        HashSet<Integer> fark=new HashSet<>(setA); // setA dan kopya oluşturuldu

        fark.removeAll(setB);

        return fark;
    }

    public static HashSet<Integer> ortakElemanlar(HashSet<Integer> setA, HashSet<Integer> setB)
    {
        HashSet<Integer> ortakElemanlar=new HashSet<>(setA); // setA dan kopya oluşturuldu

        ortakElemanlar.retainAll(setB);

        return ortakElemanlar;
    }
}
