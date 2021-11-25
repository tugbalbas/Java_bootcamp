package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Vize notunu giriniz: ");
        double vizeNotu=input.nextDouble();
        System.out.println("Final notunu giriniz: ");
        double finalNotu=input.nextDouble();
        double ort=vizeNotu*0.4 + finalNotu*0.6; // eğer sonucu double istiyorsak double eşitlemeliyiz
        //eğer int istiyorsak int e eşitlemeliyiz

        int ortInt =(int) (vizeNotu*0.4) + (int) (finalNotu*0.6);
        System.out.println("ort = " + ort);

        if (ort>60){
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("Bütünlemeye kaldınız");
        }

    }
}
