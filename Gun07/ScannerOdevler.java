package Gun07;

import java.util.Scanner;

public class ScannerOdevler {
    public static void main(String[] args) {
//        1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
//        2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
//        3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
//        4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
//        5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
//        6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
//        7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
//                Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
//        8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
//        9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.print("Adınızı giriniz:");
        String ad=input.nextLine();
        System.out.println("ad = " + ad);

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=scan.nextInt();
        System.out.println("sayi = " + sayi);

        Scanner input2=new Scanner(System.in);
        System.out.print("Sevdiğiniz meyve:");
        String meyve=input2.nextLine();
        System.out.println("meyve = " + meyve);

        Scanner scan2=new Scanner(System.in);
        System.out.print("Kapı sayısı:");
        int kapiSayisi=scan2.nextInt();
        System.out.println("kapiSayisi = " + kapiSayisi);

        Scanner input3=new Scanner(System.in);
        System.out.print("Şehir giriniz:");
        String sehir=input3.nextLine();
        System.out.println("sehir = " + sehir);

        Scanner scan3=new Scanner(System.in);
        System.out.print("Doğumgününüzü giriniz:");
        String dgunu=scan3.nextLine();
        System.out.println("dgunu = " + dgunu);

        Scanner input4=new Scanner(System.in);
        System.out.print("Banka hesabınız var mı:");
        boolean hesap=input4.nextBoolean();
        System.out.println("hesap = " + hesap);

        Scanner input5=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz:");
        byte kilo=input5.nextByte();
        System.out.println("kilo = " + kilo);

        Scanner scan4=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz:");
        float boy=scan.nextFloat();
        System.out.println("boy = " + boy);

    }
}
