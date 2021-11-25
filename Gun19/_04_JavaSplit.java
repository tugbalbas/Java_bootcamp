package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaSplit {
    public static void main(String[] args) {
        // split() : bir stringi verilen kritere göre bölerek diziye atar;

        // Kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        String[] kelimeler=cumle.split(" "); // boşluk karakterine göre cümleyi böler

        // 1. yöntem
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

        //2. yöntem
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        //3. yöntem
        for (String kelime : kelimeler) { //  kelimlerden elemanları al eleman ismiyle gönder
            System.out.println("eleman = " + kelime);

        }
    }
}
