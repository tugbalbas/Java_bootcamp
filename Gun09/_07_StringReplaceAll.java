package Gun09;

public class _07_StringReplaceAll {
    public static void main(String[] args) {
         // StringReplaceAll : replace gibi çalışır , farkı kritere göre(regex) değiştirmesidir.
        //regex=a regular expressipn/düzenli ifade
        //TODO: Googledan Java regex konusu araştırılıp seçenekler öğrenilecek

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " +text);
        System.out.println(" a,b,n leri _ yapılmış hali = " +text.replaceAll("[abn]" , "-"));
        System.out.println(" büyük harfleri _ yapılmış hali = " +text.replaceAll("[A-Z]" ,"_") );
        System.out.println(" harflerin x yapılmış hali = " +
                text.replaceAll("[A-Z]" ,"_").replaceAll("[a-z]" ,"x") );
    }
}
