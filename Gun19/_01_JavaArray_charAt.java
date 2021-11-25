package Gun19;

import java.util.Scanner;

public class _01_JavaArray_charAt {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String cumle = oku.nextLine();

        int kelimeSayisi = 0;

        for (int i = 0; i < cumle.length(); i++)
            if (cumle.charAt(i) == ' ')
                kelimeSayisi++;


        System.out.println("kelimeSayisi = " + (kelimeSayisi + 1));

        // etkilenecek sadece 1 satır ise paranteze gerek yok.
    }
}
