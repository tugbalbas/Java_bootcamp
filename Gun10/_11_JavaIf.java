package Gun10;

import java.util.Scanner;

public class _11_JavaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayi giriniz=");
        int sayi1=oku.nextInt();
        System.out.print("2.Sayi giriniz=");
        int sayi2=oku.nextInt();
        System.out.print("3.Sayi giriniz=");
        int sayi3=oku.nextInt();

        int enb=sayi1;

        if (enb < sayi2){  enb = sayi2; }
        if (enb < sayi3){  enb = sayi3; }

        System.out.println("enb = " + enb);
    }
}
