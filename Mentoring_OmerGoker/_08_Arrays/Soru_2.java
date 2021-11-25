package Mentoring_OmerGoker._08_Arrays;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
        // Scanner ile yazdığınız 3 notun(Double) ortalamasını hesaplatın.

        Scanner scan=new Scanner(System.in);
        double[] notlar=new double[3];
        double toplam=0;

        // Arrayin değerlerini girme
        System.out.println("Notları giriniz: ");
        for (int i = 0; i < notlar.length; i++) {
            notlar [i]=scan.nextDouble();
        }
        //Ortalama alma
        for (int i = 0; i < notlar.length; i++) {
            toplam+=notlar[i];
        }

        double ortalama=toplam/ notlar.length;
        System.out.println("Notların ortalaması: "+ ortalama);


    }
}
