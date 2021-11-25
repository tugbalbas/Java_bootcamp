package Gun09;

public class _06_StringReplace {
    public static void main(String[] args) {
        // Replace : bir stringin içerisindeki istenen karakter(ler)in hepsini,
        //  verilen yenisi ile değiştirir.

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("a ların e olarak değiştirilmiş hali = " + text.replace('a','e') );
        System.out.println("ba -> de hali = " + text.replace( "ba" , "de") );
        System.out.println("Dünya-> Java değiştirilmiş hali = " + text.replace("Dünya" , "Java"));
        System.out.println("a ları silebilirsiniz = " + text.replace("a","")); // Merhb Düny
    }
}
