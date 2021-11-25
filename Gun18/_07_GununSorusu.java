package Gun18;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _07_GununSorusu {
    public static void main(String[] args) {

        //1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfini Büyük ise küçük
        // küçük ise büyük hale getiriniz.

        //2- Kullanıcıdan alacağınız bir cümlenin sadece ilk harflerini bir diziye atayınız.
        //3- Kullanıcıdana alacağınız bir cümlenin kelimelerini bir diziye atayınız.
        //4- Kullanıcıda alacağını bir cümleyi kelimelerine göre tersten yazdırınız.

        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kelime girin: ");
            array[i] =scanner.nextLine();
        }
        int uzun=0;
        String kelime="";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > uzun) {
                uzun = array[i].length();
                kelime = array[i];
            }
        }
        char ilkharf = kelime.charAt(0);
        char sonharf = kelime.charAt(kelime.length() - 1);

        if (ilkharf >= 'A' && ilkharf <= 'Z')
            ilkharf = kelime.toLowerCase(Locale.ROOT).charAt(0);
        else
            ilkharf = kelime.toUpperCase(Locale.ROOT).charAt(0);
        if (sonharf >= 'A' && sonharf <= 'Z')
            sonharf=kelime.toLowerCase(Locale.ROOT).charAt(kelime.length()-1);
        else
            sonharf=kelime.toUpperCase(Locale.ROOT).charAt(kelime.length()-1);

        System.out.println(ilkharf+kelime.substring(1,kelime.length()-1)+sonharf);

    }
}

