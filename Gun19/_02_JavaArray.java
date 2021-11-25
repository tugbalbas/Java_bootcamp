package Gun19;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 20 sayıyı bir diziye attıktan sonra
        //bir sonraki kendisinden büyük kaç sayı olduğunu bulunuz ?
        // 3,4,67,5,33,23,657,3,6,7,8
        // 1+1+1+1+1+1+1

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[7];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Bir sayi giriniz: ");
            dizi[i]= oku.nextInt();
        }

        int miktar=0;
        for (int i = 0; i < dizi.length-1; i++) {
            if (dizi[i] < dizi[i+1])
                miktar++;
        }
        System.out.println("miktar = " + miktar);

    }
}