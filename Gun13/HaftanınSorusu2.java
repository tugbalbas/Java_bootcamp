package Gun13;

import java.util.Scanner;

public class HaftanınSorusu2 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("x değeri: ");
//        int x=input.nextInt();
//        System.out.println("y değeri: ");
//        int y=input.nextInt();
//
//        if (x>8 && x<-2 || y<1 || y>4)
//            System.out.println("Dışında");
//        else
//            if (y>1 && y<4 && x>-2 && x<8)
//                System.out.println("içinde");
//            else
//                System.out.println("üstünde");

        Scanner oku=new Scanner(System.in);
        System.out.print("X Koordinatini giriniz= ");
        int  x=oku.nextInt();

        System.out.print("Y Koordinatini giriniz= ");
        int  y=oku.nextInt();

        if (x<8 && x>-2 && y<4 && y>1)
            System.out.println("Icinde");

        else if (x<8 && x>-2 && y<=4 && y>=1)
            System.out.println("Uzerinde");

        else
            System.out.println("Disinda");
    }
}