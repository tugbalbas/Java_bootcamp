package Mentoring_OmerGoker._08_Arrays;

public class SingleD_forEach_2 {
    public static void main(String[] args) {

     //        Integer Array'indeki elemanları for each döngüsüyle toplayınız.

            int[] SayiArrayi={5, 8, 35, 90, 12};
            int toplam=0;

        for (int yeniSayi : SayiArrayi) {
            toplam +=yeniSayi;
        }

        System.out.println("toplam = " + toplam);
    }
}
