package Gun12;

import java.util.Scanner;

public class _01_TernaryOperator {
    public static void main(String[] args) {
        // if (a>b)     =>      a>b ? c=12 : c=15;
        //    c=12;
        // else
        //    c=15;

        // Kullanıcının gireceği sayı çift ise bir strige "çift" atayınız
        // tek ise "tek" atayınız ve ekrana stringi yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.println("Sayi: ");
        int sayi=oku.nextInt();

        String text="";

        if (sayi%2 == 0)
            text="çift";
        else
            text="tek";

        text=(sayi%2==0) ? "çift" : "tek";

        System.out.println("İşlem sonucu= "+ ( (sayi%2==0) ? "çift" : "tek"));


    }
}
