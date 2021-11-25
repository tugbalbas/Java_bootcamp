package Gun13;

import java.util.Scanner;

public class _01_IfElseIf {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Saati giriniz: ");
        int saat = oku.nextInt();

        if (saat <= 2)
            System.out.println("5 €"); // 2 den küçük
        else
            if (saat <= 5) // 2 den büyük 5den küçük eşit noktası
                System.out.println("10 €");
            else
                System.out.println("15€"); // 5 den büyük


        // 2. tercih edilmeyen yöntem
        if (saat < 2)
            System.out.println("5 €");
        if (saat > 2 && saat <= 5)
            System.out.println("10 €");
        if (saat > 5)
            System.out.println("15€");


        // Ternary yöntemi
        String ucret= saat <= 2 ? "5€" : (saat <= 5 ? "10 €" : "15 €");

        System.out.println("ucret = " + ucret);

    }
}
