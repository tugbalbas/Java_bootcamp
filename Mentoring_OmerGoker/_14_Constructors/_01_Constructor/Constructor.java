package Mentoring_OmerGoker._14_Constructors._01_Constructor;

import java.util.ArrayList;

public class Constructor {
    /*
    Yapilandirici metodlar
        Java her sinif icin bir constructor bulunur.
        Class tanimlandiginda JAVA bir adet bos constructor kendi tanimliyor
        Nesne olusturdugumuz zaman calistirilan metodlardir. (ilk calisan metod)
        Herhangi bir geri dönus tipi yoktur
        yaptigi is, bir nesneyi ilk kullanima hazirlamaktir
     */

    /*
    Erişim belirteci mutlaka public olmalıdır
    Adı sınıfın adı ile aynı olmalı
    method çağrılırken new ile çağırıyoruz
    her çağrılışında yeni bir nesne oluşturuyoruz
     */

    public static void main(String[] args) {
        Vatandas vatandas1=new Vatandas(); // nesne oluştuğu an constructora gidiyor
        System.out.println("vatandas1.tcNo = " + vatandas1.tcNo);
        Vatandas vatandas2=new Vatandas();
        System.out.println("vatandas2.tcNo = " + vatandas2.tcNo);

        ArrayList<String> list=new ArrayList<>();
        System.out.println(Math.E);
        System.out.println(Math.PI);
    }
}
