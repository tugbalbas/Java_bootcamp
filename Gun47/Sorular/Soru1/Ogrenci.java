package Gun47.Sorular.Soru1;

public class Ogrenci {
    // encapsulation old için hep private kullanıyoruz
    private String ad;
    private String soyad;
    private int yas;

    private int okulNo;
    private static int ID=1; // her bir öğr atanacağı için okul no oluşt.



    //2.adım
    public Ogrenci(String ad, String soyad, int yas) throws Exception {
        setAd(ad); //this.ad = ad;
        setSoyad(soyad); //this.soyad = soyad;
        setYas(yas); //this.yas = yas;
        setOkulNo();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
         this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    // Exception: Checkları da kapsayan genel exception
    // olduğundan CHECKED gibi işlem gördüğünden
    // THROWS veya try-catch zorunlu olmakta

    //uyarıyı alabilmek için throw new
    public void setYas(int yas) throws Exception {
        if (yas > 15)
            throw new Exception("Yaş sınırı 15");
        else
         this.yas = yas;
        // burda hata verdi try-catch kullanmadığımız için
        // methoda ekle (checked exception)
        // ben exc. ekledim beni kullanacak herkes bilsin bunu
        // ilk olarak constructordaki setYas kullandı onu düzenle.
 }



    /*
    // Genel exception olduğu için methoda eklemek zorunda kaldık
    //Runtime exc çevirince gerek kalmıyor

    public void setYas(int yas) {
        if (yas > 15)
            throw new RuntimeException("Yaş sınırı 15");
        else
            this.yas = yas;
    }

     */

    @Override
    public String toString() {
        return "ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public int getOkulNo() {
        return okulNo;
    }

    //okul no ID den gelicek o yüzden parametreyi ve thisi düzelt
    // bunun ulaşılması doğru olmadığı için private yap
    private void setOkulNo() {
        this.okulNo = ID++;
    }
}
