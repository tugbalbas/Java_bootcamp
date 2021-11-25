package Gun16;

import java.util.Scanner;

public class _07_ForLoop {
    public static void main(String[] args) {
        // Girilen stringdeki a harfi sayısını bulunuz.
        // C harfine sıra gelirse döngüden çıkılsın.

        Scanner scan=new Scanner(System.in);
        System.out.println("String giriniz: ");
        String str=scan.nextLine();

        int adet=0;
        for (int i=0; i<str.length(); i++){
            if (str.toLowerCase().charAt(i)=='a')
                adet++;
            else
                if (str.toLowerCase().charAt(i)=='c')
                    break;
        }
        System.out.println("adet = " + adet);
    }
}
