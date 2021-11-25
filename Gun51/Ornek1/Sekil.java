package Gun51.Ornek1;

public class Sekil {

    @Override
    public String toString() {
        return "Sekil : Bilgi Yok";
    }

    public double getAlan(){
        throw  new RuntimeException("Bu sınıfın bu method özelliği yoktur.");
    }
    public double getCevre(){
        return 0;
    }

}
