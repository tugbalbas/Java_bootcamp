package Gun18;

import java.util.Scanner;

public class _04_JavaArrayOrt {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        int[] dizi=new int[5];
        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for(int i=0;i<dizi.length ;i++)
        {
            System.out.print((i+1)+".sayi=");
            dizi[i]=oku.nextInt();
            toplam = toplam + dizi[i];
        }

        int ort=toplam/ dizi.length;
        int ortGecenElemanSayisi=0;
        for(int i=0;i<dizi.length ;i++)
        {
            if (dizi[i] > ort)
                ortGecenElemanSayisi++;
        }

        System.out.println("ortGecenElemanSayisi = " + ortGecenElemanSayisi);

    }
}
