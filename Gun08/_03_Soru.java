package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("String giriniz:");
        String girilen=input.nextLine();

        // 012345678901
        // tugba albas, önce uzunluğu(11) bulursun, charAt()uzunluk
        int uzunluk=girilen.length();
        char sonHarf=girilen.charAt(uzunluk-1);// Toplam karakter sayısı, sayma sayısı ile 11
        // fakat karakterlerin sıra numarası (index) ise 0dan başlar
        System.out.println("sonHarf = " + sonHarf);

    }
}
