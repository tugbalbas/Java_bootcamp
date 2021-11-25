package Gun32._02_Ornek;

public class Ornek2 {
    // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
    // 2-Adım :Çevre bulmak üzere getPerimeter isminde bir metod yazınız.
    // 3-Adım :Dikdörtgenin alanını bulan getArea isimli bir metod yazınız.

    public static void main(String[] args) {
        Rectangle dikdortgen=new Rectangle();
        dikdortgen.length=5;
        dikdortgen.width=4;

        System.out.println("Cevre= " + dikdortgen.getPerimeter());
        System.out.println("Alan = " + dikdortgen.getArea());
    }
}
