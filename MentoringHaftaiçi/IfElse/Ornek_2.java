package MentoringHaftaiçi.IfElse;

import java.util.Scanner;

public class Ornek_2 {
    public static void main(String[] args) {
         /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz".
        ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

                             todo    Koşul kısmı

            eğer ortalaması 90 'dan büyük ise, harf notu olarak AA,
                            80(80dahil)   ile 90 arasında ise  BA,
                            70(70 dahil)   ile 80 arasında ise BB,
                            60(60dahil) ile 70 arasında ise CB,
                            50(50 dahil) ile 60 arasında ise CC,
                            50 den küçükse FF

         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Vize sınav sonucunuzu giriniz :");
        double vize=scan.nextDouble();
        System.out.print("Vize sınavı yüzdesini giriniz");
        double vizeYuzde=scan.nextDouble();

        System.out.print("Final sınav sonucunuzu giriniz :");
        double finalNot=scan.nextDouble();
        System.out.print("Final sınav yüzdesini giriniz");
        double finalYuzde=scan.nextDouble();

        double vizeSonuc=vize*vizeYuzde;
        double finalSonuc=finalNot*finalYuzde;

        double toplam=vizeSonuc + finalSonuc;

        if (toplam>=90 && toplam<=100){
            System.out.println("Harf notunuz: AA");
        }
        else if (toplam>=80 && toplam<90){
            System.out.println("Harf notunuz: BA");
        }
        else if (toplam>=70 && toplam<80){
            System.out.println("Harf notunuz: BB");
        }
        else if (toplam>=60 && toplam<70){
            System.out.println("Harf notunuz: CB");
        }

        else if (toplam>=50 && toplam<60){
            System.out.println("Harf notunuz: CC");
        }
        else
            System.out.println("Harf notunuz: FF");
    }
}
