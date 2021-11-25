package Gun52.Soru1;

public class OkulMain {
    public static void main(String[] args) {
        LiseOgrencisi lo1 = new LiseOgrencisi("Furkan", "Lise");
        LiseOgrencisi lo2 = new LiseOgrencisi("Necdet", "Lise");

        LiseOgrencisi io1 = new LiseOgrencisi("Sevim", "Ilk");
        LiseOgrencisi io2 = new LiseOgrencisi("Emir", "Ilk");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);

    }
}
//        lo1 = Ogrenci{id=1, isim='Furkan', tipi='Lise'}
//        lo2 = Ogrenci{id=2, isim='Necdet', tipi='Lise'}
//        io1 = Ogrenci{id=3, isim='Sevim', tipi='Ilk'}
//        io2 = Ogrenci{id=4, isim='Emir', tipi='Ilk'}

