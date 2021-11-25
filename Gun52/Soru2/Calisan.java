package Gun52.Soru2;

public class Calisan extends Kisi{
    private double maas;

    public Calisan(String isim, String adres, Okul okul, double maas) {
        super(isim, adres, UyeTipi.CALISAN, okul);
        setMaas(maas);
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getMaas();
    }
}
