package Gun08;

public class _06_StringEquals {
    public static void main(String[] args) {
        // 2 stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç boolean olarak döner

        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // eşit mi?
        System.out.println("s1.equals(s2) = " + s1.equals("Merhaba")); // eşit mi?

    }
}
