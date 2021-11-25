package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz

        Scanner input=new Scanner(System.in);
        System.out.print("Sayıları bir boşluk bırakarak giriniz: ");
        String sayilar=input.nextLine();
        //45 7
        
        int boslukIndex=sayilar.indexOf(" ");
        String strSayi1=sayilar.substring(0, boslukIndex); // 45
        String strSayi2=sayilar.substring(boslukIndex+1); // 7

        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);

//        if (sayilar.substring(0,boslukIndex).equals(sayilar.substring(boslukIndex+1)))

        if (sayi1 == sayi2){
            System.out.println("eşit");
        }else {
            System.out.println("değil");
        }

    }
}
