package Gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız
        // Sıfır ise sıfır yazınız
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi=input.nextInt();

        if (sayi > 0){
            System.out.println("Pozitif");
        }
        if (sayi < 0){
            System.out.println("Negatif");
        }
        if (sayi == 0){
            System.out.println("sıfır");
        }

    }
}
