package Gun32._03_Ornek;

public class ElektrikHesabi {
    //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : totalKw, rate(double), bill)

    int toplamTuketim=0;
    double oran=0.7;
    double fatura=0;

    //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
    //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.

    public void tuketimEkle(int aylikTuketim){
        toplamTuketim+=aylikTuketim;
    }
    //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.
    public double odenecekTutar(){
        fatura=(oran*toplamTuketim);
        return fatura;
    }
}
