package Gun51.Ornek1;

public class Dikdortgen extends Sekil{
    private double genislik;
    private double uzunluk;

    public Dikdortgen(double genislik, double uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    @Override
    public double getAlan() {
        return uzunluk*genislik;
    }

    @Override
    public double getCevre() {
        return 2*(uzunluk+genislik);
    }
}
