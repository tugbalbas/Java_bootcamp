package Gun47.Sorular.Soru1;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    private int maxOgrenciSayisi;
    private  ArrayList<Ogrenci> ogrenciler=new ArrayList<>();
    // bunu başka bir yerde de new yapabiliriz farketmez





    public Okul(String okulAd, int maxOgrenciSayisi) {
        setOkulAd(okulAd); //this.okulAd = okulAd;
        setMaxOgrenciSayisi(maxOgrenciSayisi); //this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    // private old için hemen get set yapıyoruz
    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }


}


