package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        // bu soruyu büyük küçük harf girilsede doğru çalışacak şekilde çözünüz

        Scanner input=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String text = input.nextLine();

        if (text.length() > 10 && text.toLowerCase().contains("study"))
            System.out.println("Evet");
        else
            System.out.println("Hayır");
    }
}
