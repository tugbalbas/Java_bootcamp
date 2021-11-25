package Gun09;

public class odev {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi calisir, farki kriter(Regex) verilebilir.
        // regex=a regular expression./düzenli ifade
        // TODO:(Ödev) : Google dan Java regex konusu arastirilip secenekler ögrenilecek
        String text="Merhaba Dünya";

        System.out.println("Orjinal hali = " + text);

        System.out.println("a,b,n ->  = " + text.replaceAll("[abn]",""));
        // a,b,n karakterlerini ayri ayri bul ve  ile degistir : Merh___ Düy

        System.out.println("Bütün büyük harfler ->  = " + text.replaceAll("[A-Z]",""));
        // Büyük harfleri bul _ ile degistir. : erhaba ünya

        String text1="Merhaba Java";

        System.out.println("text1 in orjinal hali="+text1);
        System.out.println("h,b,J -> _=" +text1.replaceAll("[hbJ]","?"));
//        System.out.println("Bütün büyük harfler -> *=" +text1.
    }
}
