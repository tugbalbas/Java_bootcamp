package Gun37.DigerErisimler.Protected.bir;

public class Doktor {
    protected String ad;

    protected Doktor() { //nesne erişimi engellemek için
    }

    public Doktor(String ad) {
        this.ad = ad;
    }
    public void print() {
        System.out.println("ad = " + ad);
    }
}
