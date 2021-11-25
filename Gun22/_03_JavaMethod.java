package Gun22;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        tekMiCiftMi(3);
        tekMiCiftMi(4);
        tekMiCiftMi(8);

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int okunan=oku.nextInt();

        tekMiCiftMi(okunan);
        topla(3,4);

    }

    public static void tekMiCiftMi(int sayi){

        if (sayi%2 == 1)
            System.out.println("tek");
        else
            System.out.println("çift");
    }

    public static void topla(int s1, int s2){
        System.out.println("toplam = " + (s1+s2));
    }

}