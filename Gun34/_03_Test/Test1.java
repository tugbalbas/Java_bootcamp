package Gun34._03_Test;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    @Test
    public void DikdortgenAlanTest1(){

        // Nesneyi oluştur, değerleri ver veya
        // parametre olarak gönder
        Dikdortgen d=new Dikdortgen();
        d.yukseklik=4;
        d.genislik=5;

        // sonucu al
        int sonuc=d.alan();
        // actual : oluşan
        // expect : beklenen
        //Beklenen değer 20

        // Assert ile karşılaştır
        Assert.assertEquals("Testi Geçti", 20, sonuc );
    }

    @Test
    public void DikdortgenAlanTest2()
    {
        // Nesneyi oluştur, değerleri ver veya
        // parametre olarak gönder
        Dikdortgen d=new Dikdortgen();
        d.yukseklik=4;
        d.genislik=5;

        int sonuc=d.alan();
        // actual : oluşan
        // expect : beklenen
        //Beklenen değer 20
        Assert.assertEquals("Testi Geçemedi", 21, sonuc );
    }


}
