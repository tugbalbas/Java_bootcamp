package Gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        ArrayList<Integer> notlar=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        Scanner oku2=new Scanner(System.in);

        String devamMi;

        do {
            System.out.print("Not: ");
            int ogrNot= oku.nextInt();
            notlar.add(ogrNot);

            System.out.println("Devam (E/H)");
            devamMi=oku2.next();
        } while (devamMi.equalsIgnoreCase("E"));

        // ortalama bulunuyor
        int toplam=0;
        for (int i = 0; i < notlar.size(); i++) {
            toplam+= notlar.get(i);
        }
        int ort=toplam/ notlar.size();

        //ortalamayı geçenlerin sayısını bulalım
        int ortGecenSayisi=0;
        for(int i=0;i< notlar.size();i++){
            if ( notlar.get(i) > ort)
                ortGecenSayisi++;
        }
        System.out.println("ort = " + ort);
        System.out.println("ortGecenSayisi = " + ortGecenSayisi);
    }
}
