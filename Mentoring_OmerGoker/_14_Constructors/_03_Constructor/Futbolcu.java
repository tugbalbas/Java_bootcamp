package Mentoring_OmerGoker._14_Constructors._03_Constructor;

public class Futbolcu {

    String ad;
    int yas;
    String mevki;
    int bonservisBedeli;

    public Futbolcu(){
        // Bu boş constructorı yazmasak bile java bunu
        // bunu gizli olarak tanımlıyor
    }

    public Futbolcu(String ad, int yas, String mevki, int bonservisBedeli){

        this.ad=ad; // ad lar sırasıyla eşleşiyor
        this.yas=yas;
        this.mevki=mevki;
        this.bonservisBedeli=bonservisBedeli;

    }

    public Futbolcu(String ad, int yas){

        this.ad=ad; // ad lar sırasıyla eşleşiyor
        this.yas=yas;
        this.mevki="her yerde oynar";
        this.bonservisBedeli=0;

    }

}
