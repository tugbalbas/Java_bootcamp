package Gun33._02_Soru;

public class Soru {
    // Math sınıfndaki metodlarıdan 5 tanesini kendi isimlendirmenizle
    // ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {
        System.out.println("myMath.getMin(35,42) = " + myMath.getMin(35,42));
        System.out.println("myMath.getMax(2,5) = " + myMath.getMax(2,5));
        System.out.println("myMath.getMutlak(-10) = " + myMath.getMutlak(-10));
        System.out.println("myMath.getUs(2,5) = " + myMath.getUs(2,5));
        System.out.println("myMath.getKarekok(9) = " + myMath.getKarekok(9));

        int[] dizi={1,2,3,55,66,77};
        System.out.println("myMath.diziTopla(dizi) = " + myMath.diziTopla(dizi));

    }
}
