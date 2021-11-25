package Gun54.Soru;

public class GeoMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println("d.cevresi(4,5) = " + d.cevresi(4,5));
        System.out.println("d.alani(4,5) = " + d.alani(4,5));
        
        Cember c=new Cember();
        System.out.println("c.alani(4) = " + c.alani(4));
        System.out.println("c.cevresi(4) = " + c.cevresi(4));
        
        Kare k=new Kare();
        System.out.println("k.alani(4) = " + k.alani(4,4));
        System.out.println("k.cevresi(4) = " + k.cevresi(4));
    }
}
