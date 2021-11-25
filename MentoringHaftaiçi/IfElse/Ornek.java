package MentoringHaftaiçi.IfElse;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        // Girilen sayının negatif mi pozitif mi yoksa 0 mı old bulan bir program yazınız
        // Scanner kullanarak

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi=scan.nextInt();

//        int sayi= (int) (Math.random() * -20+1);

        if (sayi < 0){
            System.out.println("negatif");
        } else if (sayi > 0){
            System.out.println("pozitif");
        } else
            System.out.println("sıfır");
    }
}
