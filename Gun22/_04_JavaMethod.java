package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayilari birer boslukla giriniz: ");
        String cumleDizi= oku.nextLine();

        String[] strDizi=cumleDizi.split(" "); // string diziye çevrildi
        int[] intDizi=new int[strDizi.length];

        //rakam halleri yeni diziye atandı
        for (int i = 0; i < strDizi.length; i++) {
            intDizi[i] = Integer.parseInt(strDizi[i]);
        }


    }

    public  static void enBuyuk(int dizi[]){ // ismi aynı olmak zorunda DEĞİL
        Arrays.sort(dizi);
        System.out.println("enb = " + dizi[dizi.length-1]);
    }

    public static void enKucuk(int dizi[]){ // ismi aynı olmak zorunda DEĞİL
        Arrays.sort(dizi);
        System.out.println("enk = "+ dizi[0]);
    }

    public static void tumTopla(int dizi[]){ // ismi aynı olmak zorunda DEĞİL
        int toplam=0;
        for (int i = 0; i < dizi.length; i++)
            toplam+=dizi[i];
            System.out.println("toplam = " + toplam);

    }
    public static void ortalamaBul(int dizi[]){ // ismi aynı olmak zorunda DEĞİL
        int toplam=0;
        for (int i = 0; i < dizi.length; i++)
            toplam+=dizi[i];
        System.out.println("ortalama = " + toplam/ dizi.length);
    }

}