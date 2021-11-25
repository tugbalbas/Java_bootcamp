package Gun23;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan öğrenci adı ve notlarınız (60 70 90) şeklinde
        // 3 öğrenci ve 3 ders notu alınız bunların otalamasını
        // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
        // yazdırınız main içerisinde.

        for (int i = 0; i < 3; i++) {
            Scanner oku = new Scanner(System.in);
            System.out.print("Öğrencinin Adı Soyadı: ");
            String isim = oku.nextLine();

            System.out.print("Öğrencinin notları=");
            String strNotlar = oku.nextLine(); // 60 40 70 80

            System.out.println("Öğrenci = " + isim);
            System.out.println("Ortalaması = " + ortalamaBul(strNotlar));
        }

    }

    public static int ortalamaBul(String notlar){
        int toplam=0;
        String[] notDizi=notlar.split(" ");

        for (int i = 0; i < notDizi.length; i++) {
            toplam+= Integer.parseInt(notDizi[i]);
        }
        return toplam/ notDizi.length;
    }

}
