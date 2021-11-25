package Gun09;

public class _02_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : Bir stringin verilen string ile başlayıp başlamadığını kontrol eder.
        // ... ile başlıyor mu?

        String text = "Merhaba Dünya";

        System.out.println("ME ile başlıyor mu? = " + text.startsWith("ME") );
        System.out.println("Me ile başlıyor mu? = " + text.startsWith("Me") );
        System.out.println("M ile başlıyor mu? = " + text.startsWith("M") );
        System.out.println("K ile başlıyor mu? = " + text.startsWith("K") );
        System.out.println("text = " + text);
    }
}
