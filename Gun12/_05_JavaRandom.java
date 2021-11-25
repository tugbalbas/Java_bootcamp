package Gun12;

public class _05_JavaRandom {
    public static void main(String[] args) {
        // Soru: 0 ile 6 arasında random sayı üreten programı yazınız

        // Math.random() -> 0.0000 - 9.99999 arası sayı üretir
        double doubleSayi=Math.random() * 10; // 0-9 arası double sayı veriyor
        int tamSayi=(int) doubleSayi; // 0-9 arası int sayıya dönüştü
        System.out.println("tamSayi = " + tamSayi);

        tamSayi=(int) (Math.random() * 6); // 0-5 arası int sayıya dönüştü
        System.out.println("tamSayi(0-6) = " + tamSayi);
    }
}
