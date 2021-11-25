package Gun12;

import java.util.Scanner;

public class _07_JavaRandom {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri isteyerek random sayı üretiniz
        // ve üretilen sayıyı ekrana yazdırınız.
        // (int) (Math.random() * ((max-min) + 1)) + min;

        Scanner oku = new Scanner(System.in);
        System.out.print( "Min: ");
        int min = oku.nextInt();

        System.out.print("Max: ");
        int max = oku.nextInt();

        int numberInRange=(int) (Math.random() * ((max-min) + 1)) + min;
        System.out.println("numberInRange = " + numberInRange);

    }
}
