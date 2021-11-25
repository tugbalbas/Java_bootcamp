package Mentoring_OmerOzdemir.Methods;

import java.util.Scanner;

public class _3_ {
    /*
    HESAP MAKİNESİ

    Sistem sizden 2 adet sayı istesin
    Daha sonra yapılacak işlemler diye bir seçenek çıksın --->Yapılacak işlemler: T(Toplama) - F(Fark) - C(Carpma) - B(Bolme)
    Kullanıcı, 4 işlemin baş harfini kullanarak işlem türü seçilsin

    Bir static double Sobnuc methodu oluşt ve koşullar bu methodun içerisinde olsun. işlemler bu methodda yapılsın

    kullanıcının seçtiği işlem türü ile işlem yaptırıp konsola yazdırın.


     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("HESAP MAKİNESİNE HOŞGELDİNİZ");
        System.out.println();

        System.out.println("Sayı 1: ");

        double sayi1=sc.nextDouble();
        System.out.println("Sayı 2: ");
        double sayi2=sc.nextDouble();

        sc.nextLine();
        System.out.println("Yapılacak işlemler:" + "T(Toplama) - " + "F(Fark) - " + "C(Carpma) -" + "B(Bolme)");
        String islemTuru=sc.nextLine();

        //return old için print içinde çağırırız
        System.out.println(Sonuc(sayi1,sayi2,islemTuru));


    }
    public static double Sonuc(double sayi1, double sayi2, String islemTuru){
        if (islemTuru.equalsIgnoreCase("T")){
            return sayi1+sayi2;
        }else if (islemTuru.equalsIgnoreCase("F")){
            return sayi1-sayi2;
        }else if (islemTuru.equalsIgnoreCase("C")) {
            return sayi1 * sayi2;
        }else if (islemTuru.equalsIgnoreCase("B")) {
            return sayi1 / sayi2;
        }else
            return 0;

    }


}
