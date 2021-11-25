package Gun34._01_Soru;

import java.util.ArrayList;

public class Ogrenci {
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    String isim;
    int MaxDersSaati;
    ArrayList<Ders> dersleri=new ArrayList<>();

    public static Ogrenci ogrenciOlustur(String ogrAd, int maxSaati){
        Ogrenci ogr=new Ogrenci();
        ogr.isim=ogrAd;
        ogr.MaxDersSaati=maxSaati;

        return ogr;
    }

    public static void dersYazdir(Ogrenci ogr){

        System.out.println(ogr.isim+"***** Aldığı Dersler *****");
        for (Ders d : ogr.dersleri){
            System.out.println(d.dersAd+" "+d.saati);
        }
    }

    public static void dersEkle(Ogrenci ogr, Ders ders){
        if (getToplamKredi(ogr.dersleri)+ders.saati <= ogr.MaxDersSaati){
            ogr.dersleri.add(ders);
        }else {
            System.out.println(ogr.isim+" "+ders.dersAd +" "+ "Sınır aşıldı");
        }
    }

    public static int getToplamKredi(ArrayList<Ders>dersleri){

        int toplam=0;
        for (Ders d : dersleri){
            toplam+=d.saati;
        }
        return toplam;
    }
}
