package Gun07;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan adını ve soyadını alarak ekrana yazdırınız

        Scanner input = new Scanner(System.in); // okuyucuyu bir kere tanımlamamız gerekiyor

        System.out.println("Adınızı giriniz:"); // ekrana gelen veri girişnin ne için olduğunu kullanıcıya belirtmek için
        String ad = input.nextLine(); // okuma işi bu noktada yapılıyor. biz de okunan değeri değişkene eşitliyoruz

        System.out.println("Soyadınızı giriniz");
        String soyad = input.nextLine();


        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
