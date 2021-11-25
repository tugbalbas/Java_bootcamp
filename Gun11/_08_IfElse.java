package Gun11;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının poz, neg veya sıfır old yazdırınız
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=input.nextInt();

        if (sayi > 0)
            System.out.println("Pozitif");
        else if (sayi < 0)
                System.out.println("Negatif");
            else
                System.out.println("sıfır");
    }
}
