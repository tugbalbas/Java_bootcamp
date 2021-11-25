package Gun52.Soru2;

public class Kisi {
    // Ortak fieldları burda
    private String isim;
    private String adres;
    private UyeTipi uyeTip;
    private Okul okul;

    public Kisi(String isim, String adres, UyeTipi uyeTip, Okul okul) {
        setIsim(isim);
        setAdres(adres);
        setUyeTip(uyeTip);
        setOkul(okul);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public UyeTipi getUyeTip() {
        return uyeTip;
    }

    public void setUyeTip(UyeTipi uyeTip) {
        this.uyeTip = uyeTip;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }



    // tekrar tekrar çağırmaması için
    // okulu comment yapıyoruz
    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", adres='" + adres + '\'' +
                        ", okul = "+ getOkul().getIsim()+

//                ", okul=" + okul + // Bu bölüm Mainde okul toString
//                metodu çalıştırılınca çalışan ve öğrencinin
//                üst classı olan kisi sınıfındaki buradaki
//                okul değişkenini tekrar çağırarak sonsuz
//                döngü oluşturduğundan Runtime Error verdi.
//                Bu yüzden kaldırıldı.
                ", uyeTip=" + uyeTip +
                ", okul=" + okul +
                '}';
    }
}
//MAINDE
// println(okul)-> okul.toString(); -> ogrenciler (Ogrenci.toString) -> kisi.toString() -> okul.toString()
// son adımda tekrar okul.toString e döndü kısır döngüye girdi

//okulun ismini yazdırmak istersek getIsim olan satırı ekliyoruz