package Gun05;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // Bir dikdörtgenin kısa ve uzun kenar için 2 değişken tanımlayınız
        // 10 ve 15 değerlerini atayınız. Çevresini ve alanını yazdırınız.
        // ctrl+Alt+L


        int kisa = 10;
        int uzun = 15;
        int cevre = 2 * (kisa + uzun);
        int alan = kisa * uzun;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
