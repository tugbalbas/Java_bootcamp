package Gun09;

public class _03_StringToLowerCase {
    public static void main(String[] args) {
        // StringToLowerCase : Stringi küçük harfe çevirir.

        String text = "Merhaba Dünya";
        System.out.println("Orjinal hali = " + text);
        System.out.println("küçük harf hali = " + text.toLowerCase());
        System.out.println("textin büyük veya küçük harf de olsa MEile mi başlıyor = " + text.toLowerCase().startsWith("me"));
    }
}
