package MentoringCtesi.SwitchCase;

import java.util.Scanner;

public class Switch_ATM {
    public static void main(String[] args) {
         /*                      todo   Basit ATM projesi


        int bakiye belirleyin ve bakiyemizde başlangıçta 1000 tl olsun.
       todo ipucu : ->  para çekme ve yatırma işlemleri için de bir int create edin.

        Sistem bize ilk olarak seçenekleri sunmalı. Örn:

        1.Bakiye görüntüle
        2.Para yatırma
        3.Para çekme
        4.Sistemden çıkış


        Switch - Case kullanarak  4 seçenekten birini seçtirin.

       1. Bakiye görüntüle derse, sistem toplam bakiyeyi yazdırsın.

       2.Para yatırma derse, "ne kadar yatırmak istiyorsunuz?" sorusu gelsin. Bir değer girilsin ve yeni  bakiye yazdırılsın.

       3.Para çekme derse, " ne kadar para çekmek istiyorsunuz?" sorusu geldin. Bir değer girilsin ve yeni bakiye yazdırılsın.

        4.Sistemden çıkış dediğinde " Sistemden çıkılıyor.." mesajını versin.

        5.Yanlış tuşlama yapıldığında "Geçersiz işlem" mesajını versin.
 */
        //dummycode ile enter yaptırıyoruz -> scan.nextLine();

        Scanner scan = new Scanner(System.in);

        int bakiye=1000;
        int islem;

        System.out.println("1.Bakiye Görüntüle");
        System.out.println("2.Para Yatırma");
        System.out.println("3.Para Çekme");
        System.out.println("4.Sistemden çıkma");

        islem=scan.nextInt();

        switch (islem){
            case 1:
                System.out.println("Bakiyeniz : "+bakiye);
                break;
            case 2:
                System.out.print("Ne kadar yatıracaksınız? :");
                int miktar=scan.nextInt();
                bakiye+=miktar; // bakiye=bakiye+miktar
                System.out.println("Yeni bakiyeniz: " +bakiye+"Euro");
                break;
            case 3:
                System.out.println("Ne kadar para çekmek istiyorsunuz? :");
                miktar=scan.nextInt();
                bakiye-=miktar;
                System.out.println("Yeni bakiyeniz: " +bakiye+"Euro");
                break;
            case 4:
                System.out.println("Sistemden çıkılıyor...");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız...");



        }




    }
}
