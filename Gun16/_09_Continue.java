package Gun16;

import java.util.Scanner;

public class _09_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scan=new Scanner(System.in);

        int toplam=0;
        for (int i=0; i<=5; i++){ // 5 kez sayı iste
            System.out.println("sayı giriniz: ");
            int sayi=scan.nextInt();

            if (sayi>5 && sayi<10) { // 5 ile 10 arası
                System.out.println("girdiğiniz sayı 5 ile 10 arası old toplanmayacak");
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}

// sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
// DEĞİLSE While kullanılır, eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.