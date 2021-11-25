package Gun16;

import java.util.Scanner;

public class _04_ForLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi: ");
        int sayi=scan.nextInt();

        int toplam=0;
        for (int i=0; i<sayi; i++){ // for(int i=sayi; i>0; i--)
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
    }
}
