package MentoringHaftaiçi.ForLoop;

import java.util.Scanner;

public class _1_ {
    public static void main(String[] args) {
        /*
Scanner ile

Faktöriyel

 */

        Scanner sc = new Scanner(System.in);

        int fact = 1;

        System.out.print("int deger giriniz :  ");

        int num = sc.nextInt();

        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }

        System.out.println("Faktöriyel :  " + fact);


    }
}
