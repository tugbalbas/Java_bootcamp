package Gun16;

import java.util.Scanner;

public class _10_GununSorusu {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for (int i=0; i<255; i++){
            char harf=(char) i;
            System.out.println(i+" - " + harf);
        }
    }
}
