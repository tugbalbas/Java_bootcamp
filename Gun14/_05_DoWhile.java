package Gun14;

import java.util.Scanner;

public class _05_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan sıfır girilene kadar sayı isteyiniz
        // bu soruyu önce while ile çözünüz sonra do-while

        Scanner oku=new Scanner(System.in);
        int sayi=0;

        // normal while dan farkı döngüye mutlaka 1 kez girer, şart sonda kontrol edilir
        // şart sağlanıyorsa döngü devam eder

        do {
            System.out.println("sayı giriniz: ");
            sayi=oku.nextInt(); // parantezin dışında da tanısın diye int i sil dışarda tanımla yukarda
        }while (sayi !=0); // do-while döngüsü



    }
}
