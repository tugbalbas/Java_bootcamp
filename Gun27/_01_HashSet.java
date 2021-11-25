package Gun27;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        // Array -> ArrayList -> Set
        // Collections : Koleksiyonlar

        // Set: Sırası olmayan ve tekrarlayan elemanı olmayan nesneler topluluğudur.
        // Sırası olmadığı için ögeleri belirli yerlere yerleştiremeyiz. Yani ögelerin yeri belirsizdir.

        // HashSet : Kendine göre bir algoritme ile sıralayarak sakliyor. (arama bulmada bunu kull.) Gezinme hızlı
        // LinkedHashSet : Kullanıcının ekleme sırasına göre saklıyor. (kullanıcının giriş sırasına göre diyorsa bunu)
        // TreeSet : Her veri girildiğinde tüm verileri küçükten büyüğe olacak şekilde sıralayarak saklıyor.(her zaman sıralı)
        // Avantajı : ArrayListden farkı aynı elemanı 2 kez eklemiyor

        // tanımlandığı şekilde sabit eleman sayılı
        int sayi=5; // hafızada 1 rakam saklıyor
        int[] dizi=new int[5]; // hafızada 5 rakamlık yer ayırıyor.
        int[][] tablo=new int[5][5]; // 2D - bir tanımlamada 25 tane sayılık yer tanımladık.

        // eleman sayısına göre dinamik olarak artan veya azalabilen bir yapı gerekti.
        ArrayList<Integer> liste=new ArrayList<>(); // dinamik büyüyebilen ve küçülebilen dizi
        ArrayList< ArrayList<Integer> > listelerinListesi=new ArrayList<>(); // listelerin listesi oldu 2D

        // Bana artık tek tek eleman tutan bir liste veya dizi değişkeni yerine tekrarlı elemanlara izin vermeyen
        // bir yapı gerekiyorsa

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list = " + list);

        // Tekrarlara izin vermeyen eleman : HashSet
        HashSet<Integer> hs1=new HashSet<>(); // bu şekilde tanımlanıyor
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(2);

        boolean eklendiMi=hs1.add(4);
        System.out.println("eklendiMi = " + eklendiMi);

        System.out.println("hs1 = " + hs1);

    }
}

//    Collections Nedir?Koleksiyonlar Java ‘da bir nesnedir. İçinde birden fazla öğe bulundurur.
//    Öğeler, veri gruplarından oluşur; sıralı ya da sırasız olabilirler.
//    Diziler gibi düşünülebilir ancak koleksiyonlar dizilerden daha fazlasını yapabilirler.

//List: nesnelerden oluşan topluluk.İçerisinde tekrarlama olabilir, belirli
//        bir sıralaması vardır.

// Setler:
//Map: her öğesine bir anahtar atanmış nesneler topluluğudur.




//1) Uygulama: HashMap Harita arayüzünü ve HashSet Set arayüzünü uygular.
//2) Yinelemeler: HashSet yinelenen değerlere izin vermez.
// HashMap, anahtar, değer çiftlerini depolar ve yinelenen anahtarlara izin vermez.
// Anahtar yinelenirse, eski anahtar yeni değerle değiştirilir.
//3) Nesnelerin depolanması sırasında nesnelerin sayısı:
// HashMap, HashMap nesnesine bir öğe eklemek için iki nesne (K anahtarı, V Değeri) gerektirirken,
// HashSet yalnızca bir nesne eklemesi gerektirir (Nesne o).
//4) Kukla değer: HashMap'te kukla değer kavramı yoktur,
//HashSet öğeleri eklemek için dahili olarak HashMap kullanır.
// HashSet'te, add (Object) yönteminde iletilen bağımsız değişken, K anahtarı görevi görür.
// Java, add (Object) yönteminde iletilen her değer için kukla değeri dahili olarak ilişkilendirir.
//
//5) Saklama veya Ekleme mekanizması: HashMap, nesneleri depolamak veya eklemek için dahili olarak hashing kullanır,
// HashSet, nesneleri depolamak veya eklemek için dahili olarak HashMap nesnesini kullanır.
//
//6) Daha hızlı: HashSet, HashMap'ten daha yavaştır,
//
//7) Ekleme HashMap veri depolamak için put () yöntemini,
// HashSet içindeyken veri eklemek veya depolamak için add () yöntemini kullanın.
//
//8) Örnek: HashSet bir kümedir, örneğin {1, 2, 3, 4, 5, 6, 7},
//
//HashMap bir anahtar -> değer çifti (anahtardan değere) eşlemidir, örneğin {a -> 1, b -> 2, c -> 2, d -> 1}
//*HashMap'te yinelenen anahtarların olmaması gerektiğine, ancak yinelenen değerlere sahip olabileceğine dikkat edin.
//
//HashSet'te yinelenen öğeler olmamalıdır


