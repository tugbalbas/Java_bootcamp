package Mentoring_OmerGoker._10_Methods;

import java.util.Scanner;

public class _02_Method {


    public static void main(String[] args) {

        //parametreli method
        //kullanicidan not bilgisini aldiktan sonra
        //100-85 pekiyi
        //84-70 iyi
        //69-55 orta
        //45-54 gecer
        //0-45 zayif
        //ogrencinin notunun karsiligini yukardaki gibi yazan bir method yaziniz


        Scanner scr=new Scanner(System.in);
        System.out.println("notunuzu giriniz: ");
        int ogr_not=scr.nextInt();

        nothesapla(ogr_not);


    }

    public static void nothesapla(int ogrencinot){


        if (ogrencinot>=85)
        { System.out.println("Pekiyi");}
        else if (ogrencinot>=70)
        {
            System.out.println("iyi");
        }
        else if (ogrencinot>=55){
            System.out.println("orta");
        }
        else if (ogrencinot>=45)
        {
            System.out.println("gecer");
        }
        else
        {
            System.out.println("zayif");
        }

    }

}
