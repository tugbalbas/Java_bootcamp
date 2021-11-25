package Gun04;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        // \n -> yeni satır açıyor
        // \t -> tab tuşuna basılmış gibi etki yapar
        // yani bir TAB tuşuna basılmış kadar boşluk bırakır
        // \b -> BackSpace basılmış gibi bir karakter geri siler
        // \" -> Çift tırnak koyar
        // \\ -> \ işareti koyar
        // \r -> Satır başına gider

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba\nDünya"); // alt satır
        System.out.println("Merhaba \t Dünya"); // TAB
        System.out.println("Merhaba\bDünya\b"); // 1 karakter
        System.out.println("Merhaba\"Dünya"); //
        System.out.println("Merhaba\\Dünya"); // baiına \konulan özel karakterler direkt yazdırılabilir
        System.out.println("Merhaba\rDünya"); // Satır başına kadar olan karakterleri sildi. Dünya
        System.out.println("Merhaba \"Dünya\" "); // Merhaba Dünya
    }
}
