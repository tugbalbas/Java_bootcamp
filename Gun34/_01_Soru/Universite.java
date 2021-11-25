package Gun34._01_Soru;

import java.util.ArrayList;

public class Universite {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.
    public static void main(String[] args) {
        // 3- 3 adet ders oluşturunuz.

        //Ders classında metodu static olduğu için "Ders." ekliyoruz.
        Ders ders1=Ders.dersOlustur("Java101", 6);
        Ders ders2=Ders.dersOlustur("Fiz101", 4);
        Ders ders3=Ders.dersOlustur("Kim101", 3);

        Ogrenci ogr=Ogrenci.ogrenciOlustur("tugba",10);

        Ogrenci.dersEkle(ogr, ders1);// ogr.dersleri, ogr.MaxDersSaati
        Ogrenci.dersEkle(ogr, ders2);
        Ogrenci.dersEkle(ogr, ders3);

        Ogrenci.dersYazdir(ogr);

        Ogrenci ogr2=Ogrenci.ogrenciOlustur("mehmet",20);

        Ogrenci.dersEkle(ogr2, ders1);
        Ogrenci.dersEkle(ogr2, ders2);
        Ogrenci.dersEkle(ogr2, ders3);

        Ogrenci.dersYazdir(ogr2);

    }













}
