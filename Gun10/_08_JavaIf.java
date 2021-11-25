package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını ekrana yazdrınız, eşit ise eşit yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("İkinci sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("1.Sayı büyüktür = " + sayi1);
        if (sayi1 < sayi2)
            System.out.println("2.Sayi büyüktür = " + sayi2);
        if (sayi1 == sayi2)
            System.out.println("Sayilar eşittir");
    }
}
