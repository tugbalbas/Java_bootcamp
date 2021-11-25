package Mentoring_OmerGoker._14_Constructors._02_Constructor;

public class Takim {

    String ad;
    String renkler;
    int kurulusYili;

    public Takim(){
        System.out.println("takim olusturuldu fakat özellikleri belirlenmedi");
    }

    public static Takim takimOlustur(String isim, String renk, int yil){

        Takim takim=new Takim();
        takim.ad=isim;
        takim.renkler=renk;
        takim.kurulusYili=yil;

        return takim;
    }

}
