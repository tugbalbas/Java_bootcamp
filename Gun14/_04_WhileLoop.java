package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü buluarak yazdırınız.
        // TODO: ödev: tüm sayılar negatif girilirse sonuç ne olur, düzeltmek için ne yapmalısınız

        Scanner oku=new Scanner(System.in);

        int enBuyuk=0;
        int sayac=0;

        while (sayac<5){
            System.out.println("Sayı giriniz: ");
            int sayi=oku.nextInt();

            if (sayi>enBuyuk)
                enBuyuk=sayi;

            sayac++;
        }
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
