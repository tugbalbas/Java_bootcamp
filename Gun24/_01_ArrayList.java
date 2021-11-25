package Gun24;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        //array : Boyut sayısının belli olduğu durumlardaki veriler için kullanılıyor.
        int[] dizi=new int[5]; // Array : Boyutu daha sonra değiştirilemiyor.

        //ArrayList : Boyutu dinamik olarak değişebilen, yani eleman ekledikçe artabilen,
        // sildikçe azalabilen Array.
        ArrayList<Integer> integerList = new ArrayList<>(); // tanımlama
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        // String ArrayList
        ArrayList<String> isimler=new ArrayList<>();

        //Eleman Ekleme
        isimler.add("Ahmet"); // uzunluğu 1
        isimler.add("Ayşe"); // uzunluğu 2
        isimler.add("Kaya");
        isimler.add("Kaya"); // hep en sona ekler
        System.out.println("isimler = " + isimler); // hızlı yazdırma Arrays.toString

        // belli bir indexe eleman ekleme
        isimler.add(1, "Zeynep");
        System.out.println("isimler = " + isimler);

        //Belli bir indexteki elemanı alma
        String eleman=isimler.get(2);
        System.out.println("eleman = " + eleman);

        // Belli elemanı değiştirmek - update
        isimler.set(1,"Fatih");
        System.out.println("isimler = " + isimler);

        // listede kaç eleman olduğunu verir
        int elemanSayisi= isimler.size();

        //Listenin boş olup olmadığının kontrolü
        boolean listeBosMu = isimler.isEmpty();

        //Eleman Silme
        isimler.remove("Kaya"); // verilen değer göre sil
        System.out.println("isimler = " + isimler);

        isimler.remove(1);  // indexe göre sil
        System.out.println("isimler = " + isimler);

        // bir elemanın indexini nasıl bulurum ?
        int indexOfKaya= isimler.indexOf("Kaya");
        System.out.println("indexOfKaya = " + indexOfKaya);

        //Tüm elemanları boşaltma
        isimler.clear();
        System.out.println("isimler = " + isimler);

        // for kullanımı
        for(int i=0; i< isimler.size();i++)
            System.out.println("isimler = " + isimler.get(i));

    }
}
