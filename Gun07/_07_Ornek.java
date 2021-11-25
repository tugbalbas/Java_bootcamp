package Gun07;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini alıp ekrana tek satırda yazdırınız

        Scanner input = new Scanner(System.in);
        //oku.useLocale(Locale.UK); // okuma işleminde lokalizasyon (,.) setlemek için kullanılır

        System.out.println("Boyunuzu giriniz:");
        double boy=input.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        double kilo=input.nextDouble();

        System.out.println("boyunuz ve kilonuz = " + boy + " " + kilo);
    }
}
