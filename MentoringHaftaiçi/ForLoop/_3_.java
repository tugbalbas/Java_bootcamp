package MentoringHaftaiçi.ForLoop;

import java.util.Scanner;

public class _3_ {
    public static void main(String[] args) {
        /*
Kullanıcıdan bir kelime girmesini isteyin.
Yazdıgınız program sayesinde girilen kelimenin son karakterinden başlayarak ilk karaktere kadar sırayla "artarak yazdırsın"
ve en sonda asıl kelimeye ulaşsın.

Konsol örneği :

Kelime gir :  Almanya
a
ya
nya
anya
manya
lmanya
Almanya

 */
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir kelime giriniz :  ");

        String s = sc.nextLine();
        String yeniString="";

        for (int i = s.length(); i >=0; i--) {
            yeniString=s.substring(i);
            System.out.println(yeniString);

        }


    }
}
