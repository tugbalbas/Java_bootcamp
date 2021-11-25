package Gun53.finalAttribute2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba = new Araba("ford");

        System.out.println("araba.Model = " + araba.Model);

        Araba araba2 = new Araba("opel");
        System.out.println("araba2.Model = " + araba2.Model);

//        araba2.Model ="honda";
        // final tipi değişkenlerde ilk değer sadece
        // tanımlandığı yerde veya
        // constructorda atanabilir.
        // sonradan değiştirilemez
    }
}
