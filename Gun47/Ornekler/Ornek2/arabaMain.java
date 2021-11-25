package Gun47.Ornekler.Ornek2;

public class arabaMain {
    public static void main(String[] args) {
        Araba araba =new Araba();

        // araba.renk; buna bu şekilde ulaşılamadığı için get-set oluşturuyoruz
        // artık aşağıdaki gibi kullanabiliriz
        araba.setModel("BMW");
        araba.setRenk("kırmızı");
        araba.setMotor(1600);
        araba.setKapiSayisi(9); // 9 kapı olamayacağı için setin içini düzenle
        //set once oldugu icin uyarı önce çıkıyor

        System.out.println("araba = " + araba);

        // Bu sefer constructorla yapalım
        Araba araba2=new Araba("Mavi","mercedes",2000,9);
        System.out.println("araba2 = " + araba2);
        // Direkt verdiğimiz zaman kapı sayısına hatalı atama yapabildik
        // Bu nedenle constaki thisleri set ile değiştiriyoruz
        // şimdi encapsulation oldu

// yukardaki iki yöntem de kullanılıyor az olduğu constructor ile
// çok olduğu zaman set ile oluşturabiliyoruz

    }
}
//  Kapı sayısı 2 veya 4 olabilir
// araba = Araba{renk='kırmızı', model='BMW', motor=1600, kapiSayisi=0}
// Kapı sayısı 2 veya 4 olabilir
// araba2 = Araba{renk='Mavi', model='mercedes', motor=2000, kapiSayisi=0}