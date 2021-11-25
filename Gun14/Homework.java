package Gun14;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        1- Kullanıcıdan alacağınız 20 sayıdan en büyük olanını bulunuz
//        2- Kullanıcının gireceği 5 sayıdan onlar basamağı en büyük olan sayıyı bulunuz.
//        3- girilen bir sayının basamaklarına göre tersi olan sayıyı bulunuz.
//        5- Girilen bir sayının tersi ile aynı olup olmadığınız bulunuz.
//        6- # **do while loop kullanınız.**
//           > "Hello World" yazdırın, i 10 dan küçüktür ve i'yi arttırın. (1 i, 2 i, 3 i, 4 i...)
//        7- # **do while loop kullanınız.**
//           > "Hello World" yazdırın, i 0'dan büyüktür ve i'yi azaltın. (9 i, 8 i, 7 i, 6 i...)
//        8- # do while loop kullanınız.
//           > 0 ile 30 arasındaki bütün çift sayıları yazdırınız.

        /////1.SORU/////
//        Scanner scan=new Scanner(System.in);
//        int sayac=0;
//        int sayi=0;
//        int maxSayi=0;
//        while (sayac<20){
//            System.out.println("Sayı giriniz");
//            sayi=scan.nextInt();
//            if (sayi>maxSayi){
//                maxSayi=sayi;
//            }
//            sayac++;
//        }
//        System.out.println("maxSayi = " + maxSayi);

        /////2.SORU/////
//        Scanner scan=new Scanner(System.in);
//        int sayac=0;
//        int sayi=0;
//
//        int maxOnlar=(sayi/10)%10;
//
//
//        while (sayac<5){
//            System.out.println("Sayı giriniz");
//            sayi=scan.nextInt();
//            if (sayi>maxOnlar){
//                maxOnlar=sayi;
//            }
//            sayac++;
//        }
//        System.out.println("maxOnlar = " + maxOnlar);

        /////3.SORU/////
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Sayı giriniz");
//        int sayi=scan.nextInt();
//        System.out.println("tersi");
//
//        while (sayi>0){
//            System.out.print(sayi%10);
//            sayi/=10;
//        }
        
//        /////6.SORU/////
//       int i=0;
//       do{
//           System.out.println("i = " + i+"Hello World");
//           i++;
//       }while (i<10);

        /////7.SORU/////
//        int i=10;
//        do{
//            System.out.println("Hello World");
//            System.out.println("i = " + i+"Hello World");
//            i--;
//        }while (i>0);

        /////8.SORU/////
        int i=1;
        do{
           if (i%2==0){
               System.out.println("i = " + i);
               i++;
           }
        }while (i<=30);
        System.out.println("i = " + i);








    }
}
