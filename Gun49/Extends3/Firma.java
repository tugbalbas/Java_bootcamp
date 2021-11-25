package Gun49.Extends3;

public class Firma {
    public static void main(String[] args) {
        Calisan calisan=new Calisan("Mesut",2500,2);
        System.out.println("calisan.toString() = " + calisan.toString());
        System.out.println("calisan.maasHesapla() = " + calisan.maasHesapla());

        GenelMudur gm=new GenelMudur("Ragıp",4000,2,1000);
        System.out.println("gm.toString() = " + gm.toString());
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());

    }
}
//        calisan.toString() = Calisan{ismi='Mesut', maas=2500.0, maasKatsayisi=2}
//        calisan.maasHesapla() = 5000.0
//        gm.toString() = Calisan{ismi='Ragıp', maas=4000.0, maasKatsayisi=2} 1000.0
//        gm.maasHesapla() = 9000.0
