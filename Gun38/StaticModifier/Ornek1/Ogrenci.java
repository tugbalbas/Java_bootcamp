package Gun38.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım Lisesi"; // okulAdını 500 kez kullanmak için 1 tane olsun hep kullanalım bunun için static

    //okulAdı parametresini de siliyoruz
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
//        this.okulAd =
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
