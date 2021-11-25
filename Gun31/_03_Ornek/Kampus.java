package Gun31._03_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Okul ve Ogrenci sınıfları olan bir yapı tasarlıyoruz
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.numara=1;
        ogrenci1.ad="Tugba";
        ogrenci1.soyad="Albas";

        Ogrenci ogrenci2= new Ogrenci();
        ogrenci2.numara=2;
        ogrenci2.ad="Zeynep";
        ogrenci2.soyad="Akar";

        Okul okul1=new Okul();
        okul1.adi="Cumhuriyet";
        okul1.adres="Merkez Mah.";
        okul1.mudur="Rana";
        okul1.ucreti=20000;

        ogrenci1.Okulu=okul1;

        System.out.println("ogrenci1.Okulu.adi = " + ogrenci1.Okulu.adi);
        System.out.println("ogrenci1.Okulu.mudur = " + ogrenci1.Okulu.mudur);

        // öğrenci1 i yazdırınız bütün bilgilerini

        ogrenci2.Okulu=new Okul(); // Okulu ekleme: 2. yöntem
        ogrenci2.Okulu.mudur="Hilal";
        ogrenci2.Okulu.ucreti=30000;

        System.out.println("ogrenci1.ad = " + ogrenci1.ad);
        System.out.println("ogrenci1.soyad = " + ogrenci1.soyad);
        System.out.println("ogrenci1.numara = " + ogrenci1.numara);
    }
}
