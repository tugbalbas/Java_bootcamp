package Gun23;

import java.util.Scanner;

public class _02_JavaMethod {
    // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
    // yaptıktan sonra main de yazdırınız.
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı = ");
        int sayi1 = oku.nextInt();
        System.out.print("2.Sayı = ");
        int sayi2 = oku.nextInt();

        int enb=enBuyukBul(sayi1,sayi2); // Math.max()
        System.out.println("enb = " + enb);
    }

    public static int enBuyukBul(int s1, int s2)
    {
        //1.yöntem
//        int enb=0;
//
//        if (s1>s2)
//            enb= s1;
//        else
//            enb=s2;
//
//        return enb;

        //2.yöntem
        if (s1>s2)
            return s1;
        else
            return s2;
    }
}
