package Gun09;

public class _05_StringTrim {
    public static void main(String[] args) {
        // Trim : sttringin başında ve sonunda olan boşluk karakterlerini temizler.

        String text = "  Merhaba Dünya  ";

        System.out.println("Orjinal hali = -> " +text+"<-");
        System.out.println("baş ve sondaki boşlukların temizlenmiş hali = ->" +text.trim()+"<-");

    }
}
