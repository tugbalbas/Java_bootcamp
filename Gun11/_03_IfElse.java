package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi old yazdırınız
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();

        if (sayi%2 ==1){
            System.out.println("Sayı tektir");
        }
           else{
            System.out.println("Sayı çifttir");
        }


    }
}
