package Gun54.Soru;

public class Cember implements ISekil{


    @Override
    public double cevresi(int...dizi) {
        return Math.PI * 2 * dizi[0];
    }

    @Override
    public double alani(int...dizi) {
        return Math.PI*dizi[0]*dizi[0];
    }
}
