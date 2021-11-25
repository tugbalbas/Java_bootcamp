package javaDemos.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println("sozluk.size = " + sozluk.size());

        for (String item : sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer"+sozluk.get(item)); //System.out.println("item = " + item);
            // O anki eleman o anki elemanın değeri
        }



        sozluk.remove("table");
        sozluk.clear();
        System.out.println("sozluk = " + sozluk.get("table"));
    }
}
