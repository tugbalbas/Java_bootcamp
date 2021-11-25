package Gun16;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar olan sayıların çarpımını (faktöryel) hesaplayınız.
        // 5! =>  54321
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi: ");
        int sayi=scan.nextInt();

        int fakt=1;
        for (int i=1; i<sayi; i++){
            fakt*=i;
        }
        System.out.println("fakt = " + fakt);
    }
}
