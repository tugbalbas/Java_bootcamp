package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet.sorular;

import java.util.Arrays;
import java.util.HashSet;

public class hs_5 {
    public static void main(String[] args) {

        // Main methodun içimde İki adet set oluşturun. Bu setlerin içinde isimler tekrar etsin.
        // Set1 -> "Mehmet", "Ahmet", "Ayşe", "Hüseyin", "Murat"
        // Set2 -> "Caner", "Ahmet", "Elif", "Hüseyin", "Murat", "Esra"
        // Main methodun dışında bir method'da bu iki set'de toplam kaç kişi olduğunu hesaplayın.

        HashSet<String> set1=new HashSet<>(Arrays.asList("Mehmet", "Ahmet", "Ayşe", "Hüseyin", "Murat"));
        HashSet<String> set2=new HashSet<>(Arrays.asList("Caner", "Ahmet", "Elif", "Hüseyin", "Murat", "Esra"));

    }

}
