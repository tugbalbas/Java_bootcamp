package Gun16;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın

        Scanner scan=new Scanner(System.in);
        System.out.println("String giriniz: ");
        String str=scan.nextLine();

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==' ')
                continue; //continue çalıştığı anda devam eden satırlar pas geçilir ve sonraki adımdan devam edilir.

            System.out.println(str.charAt(i));
        }

    }
}
