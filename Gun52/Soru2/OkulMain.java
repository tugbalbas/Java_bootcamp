package Gun52.Soru2;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul = new Okul("Cumhuriyet",500);

        Calisan c1 = new Calisan("Erdal","Kartal",okul,10000);
        Calisan c2 = new Calisan("Ragıp","Maltepe",okul,30000);

        Ogrenci o1 = new Ogrenci("Coşkun","Tuzla",okul,70000);
        Ogrenci o2 = new Ogrenci("Mesut","Tuzla",okul,70000);

        okul.calisanEkle(c1);
        okul.calisanEkle(c2);

        okul.ogrenciKayit(o1);
        okul.ogrenciKayit(o2);


    }
}
