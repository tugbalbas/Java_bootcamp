package Polymorphism_1._04_P;

public class yemekler {

    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public yemekler(String isim){
        this.isim = isim;
    }

    public String siparis(){
        return "Acıktık";
    }
}
