package Gun08;

public class _11_StringSubstring {
    public static void main(String[] args) {

        // Stringin belli bir bölümünü alma işlemi

        String s1="MErhaba arkadaşlar";
        System.out.println("1. Bölüm rhab = " + s1.substring(2,6)); // 2 nolu indexten 6ya kadar 6 dahil değil
        // alt sınır dahil, üst sınır değil

        System.out.println("2. Bölüm arkadaş = " + s1.substring(8,15));
        System.out.println("3. Bölüm arkadaşlar = " + s1.substring(8)); // verilen indexten sona kadar alır

    }
}
