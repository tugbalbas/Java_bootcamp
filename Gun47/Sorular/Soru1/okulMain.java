package Gun47.Sorular.Soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class okulMain {
    public static void main(String[] args) {

        Okul okul1=new Okul("Kabataş Lisesi",3);


        Scanner oku=new Scanner(System.in); //String için
        Scanner okuInt=new Scanner(System.in);

        int ogrenciSayisi=1;
        do{
            System.out.print(ogrenciSayisi+".Öğrenci Adı=");
            String ogrAd=oku.nextLine();

            System.out.print(ogrenciSayisi+".Öğrenci Soyadı=");
            String ogrSoyad=oku.nextLine();

            System.out.print(ogrenciSayisi+".Öğrenci Yaşı=");
            int ogrYas=okuInt.nextInt();
            // bunları kullanıcıdan aldıktan sonra ogranci oluşturuyor ve liste ekliyoruz

            try {
                Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, ogrYas);
                okul1.getOgrenciler().add(ogr); //getOgrenciden bak
                ogrenciSayisi++;
            }
            catch (Exception ex){
                System.out.println("Uyarı mesajı: " + ex.getMessage());
                System.out.println("Lütfen tekrar giriniz");
            }

        }while (ogrenciSayisi <= okul1.getMaxOgrenciSayisi() );





    }
}
// constructora throw eklediğimiz için Ogrenci hata verdi
// beni try-catch e al dedi

//interview sorusu: her metoda throws exception kullanmak doğru değil (iş yükü)
// en doğrusu try catch kullanmak