package Gun61;

public class S24 {
    public static void main(String[] args) {
        String[] strs = new String[2];
//        strs[0]=""; // bununla null aynı değildir.
//        strs[1]="";
        int idx=0;

        for(String s: strs)
        {
            strs[idx].concat(" element "+ idx);
            idx++;
        }

        for(idx=0;idx< strs.length;idx++)
        {
            System.out.print(strs[idx]);
        }

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "strs[idx]" is null
        //	at Gun61.S24.main(S24.java:12)


//        String b="ismet";
//        b=b.concat("temur");
//        System.out.println(b);
    }

}

//    Bilgisayarda string ifadelerin değişkene atıldığında
//        mesala 2 harfli bir değişken String değişkenine atılıyor.
//
//        String renk="AL"; -> hafızadaki hali -> AL\n
//
//        bir de uzun bir değer atılıyor.
//
//        String renk="Kahverengi"; -> hafızadaki hali -> Kahverengi\n
//
//        Bilgisayar string ifadeleri yazarken hepsinin sonun son adında bize gözükmeyen
//        ama kendisin bildiği ek bir karakter ekler. böylece hafızadan nereye kadar okuyacağını
//        anlar buna satır sonu karakteri denir. görüntü itibariyle \n gibi düşünebilirsin.
//
//        eğer bir stringe "" atıldığında onun olduğu yere satır sonu karakteri atmış olursunuz.
//        yani artık NULL değildir.
//        bir string NULL ise sonu belli değildir.
// NULL olan bir değere bir şey eklenemz bu RUNTIME hatası verdirir.


