package Mentoring_OmerGoker._08_Arrays;

import java.util.Scanner;

public class SingleD_split_1 {
    public static void main(String[] args) {

         // Bir Scanner oluşturup bir atasözü giriniz.
         // Girdiğiniz atasözünde her " " (Boşluk) da split methodu uygulansın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir atasözü giriniz: ");
        String atasozu=sc.nextLine();
        String[] kelime=atasozu.split(" ");

        for (String eleman : kelime) {
            System.out.println(eleman);
        }
    }
}
