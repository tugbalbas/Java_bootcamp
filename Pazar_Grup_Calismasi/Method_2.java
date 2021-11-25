package Pazar_Grup_Calismasi;

public class Method_2 {
    public static void main(String[] args) {

        //int tipinde a ve b sayısının karelerinin toplamını bulunuz

        int a = 0;
        int b = 0;

        int sonuc = toplama(a, b);

        System.out.println(sonuc);
    }

    private static int toplama(int a, int b) {

        int adeger = karesi(a);
        int bdeger = karesi(b);


        return adeger + bdeger;

    }

    private static int karesi(int sayi) {

        sayi=sayi*sayi;
        return sayi;
    }

}
