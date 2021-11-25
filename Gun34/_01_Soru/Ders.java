package Gun34._01_Soru;

public class Ders {
    // 1- Ders sınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
    String dersAd;
    int saati;

    public static Ders dersOlustur(String dersAd, int saati){
        Ders ders=new Ders();
        ders.dersAd=dersAd;
        ders.saati=saati;

        return ders;
    }
}
