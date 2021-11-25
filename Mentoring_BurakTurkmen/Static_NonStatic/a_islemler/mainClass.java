package Mentoring_BurakTurkmen.Static_NonStatic.a_islemler;

public class mainClass {
    /*
            -----------       İki random sayı ile 4 işlem                   -----------
islemClass isminde bir class oluşturun.
bu classta 4 işlem için 4 ayrı method oluşturun.        örn: public int topla(int a, int b)- çıkarma - çarpma - bölme
return olarak o işlemi versin. örn: return a-b;
    ---------------------------------------------------
main classımızda iki int oluşturun ve bu iki int 0'dan 15 e kadar random sayılar alsın.
Bu iki int'i    4işlem methodlarında kullanın.
konsol şöyle olmalı:            (Sayılar her run yapıldığında değişmeli, random atanmalı)
Sayı 1 =  9
Sayı 2 =  4
------------İşlemler ----------
Toplama:  13
Çıkarma:  5
Çarpma:   36
Bölme:    2.25

static method kullanmadan yapınız. Yani ne kullancağız... ?
 */

    public static void main(String[] args) {

        islemClass islem = new islemClass();

        int randomSayi1 = (int) (Math.random()*16);
        int randomSayi2 = (int) (Math.random()*16);

        System.out.println("---------İŞLEMLER----------");

        System.out.println("Random Sayi 1: " + randomSayi1);
        System.out.println("Random Sayi 2: " + randomSayi2);

        System.out.println("Toplama: " + islem.toplama(randomSayi1,randomSayi2));
        System.out.println("Çıkarma: " + islem.cikarma(randomSayi1,randomSayi2));
        System.out.println("Bölme: " + islem.bolme(randomSayi1,randomSayi2));
        System.out.println("Çarpma: " + islem.carpma(randomSayi1,randomSayi2));


    }
}
