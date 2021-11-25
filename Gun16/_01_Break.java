package Gun16;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.

        // 16 -> evet

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=scan.nextInt();

        int sayac=1;
        int arananSayi=0;

        while (sayac < sayi){ //1,2,3,4,5,6,7,8
            if (sayac*sayac == sayi){
                arananSayi = sayac;
                break; // çalıştığında döngüyü keser, kırar
            }
            sayac++;
        }

        if (arananSayi>0)
            System.out.println("true");
        else
            System.out.println("false");
        System.out.println("arananSayi = " + arananSayi);
    }
}
