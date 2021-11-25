package MentoringHaftaiçi.ForLoop;

import java.util.Scanner;

public class _4_ {
    public static void main(String[] args) {
        /*
bir sayı giriniz.
 girdiginiz sayıya kadar olan bütün sayılar toplansın ve konsola yazılsın

 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir int değeri giriniz :  ");

        int num = sc.nextInt();

        int toplam=0;
        for (int i = 0; i <= num; i++) {
            toplam+=i;

        }
        System.out.println("toplam = " + toplam);

    }
}
