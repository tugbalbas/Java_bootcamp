package Gun12;

import java.util.Scanner;

public class _04_JavaMath {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print(" a= ");
        int a=oku.nextInt();

        System.out.print("b= ");
        int b= oku.nextInt();

        System.out.print("c= ");
        int c= oku.nextInt();

        //       int enb = Math.max(a,b);
        //       enb = Math.max(enb, c);
        //       System.out.println("enb = " + enb);

        System.out.println("enb = " + Math.max( Math.max(a,b), c));
    }
}
