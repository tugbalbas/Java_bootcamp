package Gun09;

public class _08_StringReplaceFirst {
    public static void main(String[] args) {

        // StringReplaceFirst : Replace ile aynı sadece ilk bulunanı değiştirir.

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " +text );
        System.out.println("bütün a ların değiştiği hali = " +text.replace('a','e') );
        System.out.println("ilk bulunan a nın değiştiği hali = " +text.replaceFirst("a" , "e") );
    }
}
