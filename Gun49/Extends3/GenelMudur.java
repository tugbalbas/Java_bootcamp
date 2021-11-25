package Gun49.Extends3;

public class GenelMudur extends Calisan {
    double tazminat;

    // eksik olanları ekleyerek..
    public GenelMudur(String ismi, double maas, int maasKatsayisi, double tazminat) {
        super(ismi, maas, maasKatsayisi);
        this.tazminat = tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla() +tazminat;

    }

    // tazminatın da eklenebilmesi için
    @Override
    public String toString() {
        return super.toString()+" "+tazminat;
    }

}
