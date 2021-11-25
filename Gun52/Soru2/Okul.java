package Gun52.Soru2;

import java.util.ArrayList;

public class Okul {
    private String isim;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci>ogrencileri = new ArrayList<>();
    private ArrayList<Calisan>calisanlar = new ArrayList<>();

    public Okul(String isim, int maxOgrenciSayisi) {
        this.isim = isim;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }


    public void ogrenciKayit(Ogrenci ogr){
        ogrencileri.add(ogr);
    }

    public void calisanEkle(Calisan cal){
        calisanlar.add(cal);
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    public ArrayList<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }
    //listelemek
    public void ogrenciListele(Ogrenci ogr){
        for (Ogrenci o : ogrencileri) {
            System.out.println("o = " + o);
        }
    }

    public void calisanListele(Calisan cal){
        for (Calisan c : calisanlar) {
            System.out.println("c = " + c);
        }
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrencileri=" + ogrencileri +
                ", calisanlar=" + calisanlar +
                '}';
    }
}
