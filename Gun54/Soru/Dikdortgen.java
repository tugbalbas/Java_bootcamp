package Gun54.Soru;

public class Dikdortgen implements ISekil{


    @Override
    public double cevresi(int...dizi) {
        if (dizi.length == 1)
            return (dizi[0]+dizi[0])*2;
        else
            return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alani(int...dizi) {
        return dizi[0]*dizi[1];
    }
}
