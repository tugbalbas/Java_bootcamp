package Gun22;

public class  _01_JavaMethod {
    // buraya
    public static void main(String[] args) {

        System.out.println("Merhaba dünya"); // ekrana yazı yazdırır
        System.out.println("Merhaba dünya");
        System.out.println("Merhaba dünya");

        Math.max(5,6); // daha önce yazılmış biz çağırıp kullanıyoruz
        // aynı bunun gibi bizde böyle metodlar yazabiliriz.
        // mesala ekrana merhaba dünya yazan bir metod yazalım ve onu sürekli çağıralım.

        merhabaYaz(); // fonksiyonu çağırma şekli
        merhabaYaz();
        merhabaYaz();

    } // main in parantezinin bittiği yer
    // veya buraya

    public static void merhabaYaz() // mainle aynı ismini sen ver
    {
        System.out.println("Fonksiyon Merhaba Dünya");
    }

    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}