package Gun54.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
        // bir interface in birden fazla class tarafından implemente edilmesi

        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

//        Çember çizildi.
//        Dikdörtgen çizildi.

        // interfacelerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. polymorphism sayesinde

        ICizilebilir cember2=new Cember();
        cember2.ciz();

    }
}
// 1 tane interface'i 2 farklı classta kullanmayı inceledik