package Gun51.Ornek1;

public class Cember extends Sekil{
    private double yaricap;
    //alan yok

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getCevre() {
        return 2 * Math.PI * yaricap;
    }

}
