package Mentoring_BurakTurkmen.HashSet_TreeSet_LinkedHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        HashSet<String> hs = new HashSet<>();

        hs.add("Burak");
        hs.add("Gülsüm");
        hs.add("Mustafa");
        hs.add("Elif");
        hs.add("Büşra");
        hs.add("Fatih");

        boolean usernameAccepted=false;
        System.out.println("Kullanıcı adı giriniz: ");

        do {
            String username=sc.next();

            if (hs.add(username)){

                System.out.println("Kullanıcı adı geçerli...");
                usernameAccepted=true;

            }else System.out.println("Bu kullanıcı alınmış. Tekrar deneyiniz...");

        }while (!usernameAccepted);



    }
}
