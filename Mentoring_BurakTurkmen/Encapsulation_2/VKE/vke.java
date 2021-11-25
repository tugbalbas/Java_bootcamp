package Mentoring_BurakTurkmen.Encapsulation_2.VKE;

public class vke {

    //vke 18.5 küçükse zayıf,
    //25'den küçükse normal
    //30 dan kücükse kilolu
    //30dan büyükse obez

    // vke kilo/(boy*boy)    Math.round();

    //bu ikisininde methodunu oluşturalım.

    private String isim;
    private int yas;
    private double kilo;
    private double boy;

    public double getVKE(){
        double vke = kilo/(boy*boy);
        return Math.round(vke);
    }

    public String getVeri(){
        double vke = getVKE();

        if (vke < 18.5)
            return "zayıf";
        else if (vke < 25)
            return "normal";
        else if (vke < 30)
            return "kilolu";
        else
            return "obez";

    }

    public vke(String isim, int yas, double kilo, double boy) {
        this.isim = isim;
        this.yas = yas;
        this.kilo = kilo;
        this.boy = boy;
    }
}
