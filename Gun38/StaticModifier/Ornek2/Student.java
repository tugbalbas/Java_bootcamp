package Gun38.StaticModifier.Ornek2;

public class Student {
    int id;
    String ad;
    String soyadi;

    static int sayac=1;

    public Student(String ad, String soyadi) {

        this.id=++sayac;
        this.ad = ad;
        this.soyadi = soyadi;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id='" + id + '\'' +
                "ad='" + ad + '\'' +
                ", soyadi='" + soyadi + '\'' +
                '}';
    }
}
