package Gun08;

public class _05_StringContains {
    public static void main(String[] args) {
        // Bir stringin içinde karakter(lerin) var olup olmadığını kontrol eder
        // var ise boolean cinsinden true döndürür yoksa false olur sonuç

        String str = "Merhaba Dünya";

        boolean varMi=str.contains("a");
        System.out.println("varMi = " + varMi); //true

        System.out.println("varMi(aba) = " + str.contains("aba"));
        System.out.println("varMi(f) = " + str.contains("f"));
        System.out.println("varMi(ya) = " + str.contains("ya"));
        System.out.println("varMi(A) = " + str.contains("A"));
    }
}
