package Gun52.Soru1;

public class Ogrenci {
    private int id;
    private String isim;
    private String tipi;

    protected static int sayacID=1;

    // özellikleri tek tek almak için get-set kullanmak şart
    // biz burda öğrencileri direkt yazdırdığımız için gerek duymadık
    public Ogrenci(String isim, String tipi) {
        this.id = sayacID++;
        this.isim = isim;
        this.tipi = tipi;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
