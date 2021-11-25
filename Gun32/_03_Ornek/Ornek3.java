package Gun32._03_Ornek;

public class Ornek3 {
    // 1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
    //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : totalKw, rate(double), bill)
    //3.Adım  :Customer a bir ElektrikHesabi ekleyiniz.
    //4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
    //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
    //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
    //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.
    public static void main(String[] args) {
        //4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
        Musteri musteri=new Musteri();
        musteri.name="Necdet";

        ElektrikHesabi hesap=new ElektrikHesabi();
        musteri.elektrikHesabi=new ElektrikHesabi();
        musteri.elektrikHesabi=hesap;

        musteri.elektrikHesabi.tuketimEkle(100);
        musteri.elektrikHesabi.tuketimEkle(150);

        System.out.println("toplam tuketim = " + musteri.elektrikHesabi.toplamTuketim);

        System.out.println("odenecek tutar = " + musteri.elektrikHesabi.odenecekTutar()); // 2. Yöntem
        System.out.println("odenecek tutar (2) = " + musteri.elektrikHesabi.fatura); // 1.Yöntem


    }

}
