package Gun36._02_Constructor;

import java.util.ArrayList;

public class Kitapci {
    // Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {
        Kitap kitap1=new Kitap();
        kitap1.name="Sefiller";

        Kitap kitap2=new Kitap("Java", 1970, "Javanın Efendileri");
        Kitap kitap3=new Kitap("Sefiller",1800);

        kitap1.goster();
        kitap2.goster();
        kitap3.goster();

        // ekrana yazdırırken
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        System.out.println("liste = " + liste);
        // toString(), string hali istenince o çalışıyor.

        System.out.println("kitap1 = " + kitap1);
        System.out.println("kitap2 = " + kitap2);


    }
}
//        2. yazdırma methodu
//        System.out.println(book1); // book1 in stringe çevrilmiş hali, toString
//        System.out.println(book1.toString()); // aslında bunu yapıyor.