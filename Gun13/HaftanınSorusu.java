package Gun13;

import java.util.Scanner;

public class HaftanınSorusu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("x değeri:");
        int x= input.nextInt();
        System.out.println("y değeri:");
        int y=input.nextInt();

        if (x>0 && y>0)
            System.out.println("A");
        else if (x<0 && y>0)
            System.out.println("B");
        else if (x<0 && y<0)
            System.out.println("C");
        else
            System.out.println("D");
    }
}
