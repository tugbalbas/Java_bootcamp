package MentoringHaftaiçi.IfElse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
           /*
        Sistem şu mesajı versin :    1.Stringi giriniz."
        String s1 oluşturunuz.

                                      2.String i giriniz.

         String s2 oluşturunuz.


                                      3.String'i giriniz.


        String s3 oluşturunuz.

        Girilen 3 Stringin de tek tek karakter sayıları bulunsun.
        3 stringin de karakter sayıları toplansın.
        sonuc 10'dan küçük ise   "Kısa mesaj"
        sonuç    10'dan büyük VE  15 ten küçük ise (10 ve 15 dahildir) "Orta Uzunlukta mesaj" ----- VE = &&
        sonuç  15'ten fazla ise         "Uzun Mesaj"
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Stringi giriniz");
        String str1=scan.nextLine();
        System.out.println("2.Stringi giriniz");
        String str2=scan.nextLine();
        System.out.println("3.Stringi giriniz");
        String str3=scan.nextLine();

        int str1Length=str1.length();
        int str2Length=str2.length();
        int str3Length=str3.length();

        int toplam=str1Length+str2Length+str3Length;

        if (toplam<10){
            System.out.println("KIsa mesaj");
        }if (toplam>=10 && toplam<=15){
            System.out.println("Orta Uzunlukta mesaj");
        }if (toplam>15){
            System.out.println("Uzun mesaj");
        }

    }
}
