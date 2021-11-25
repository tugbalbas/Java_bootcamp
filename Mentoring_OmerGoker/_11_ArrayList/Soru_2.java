package Mentoring_OmerGoker._11_ArrayList;

import java.util.ArrayList;

public class Soru_2 {
    public static void main(String[] args) {
         /*
Int arrayList oluşturun. 10 elemandan oluşmalı.
Random ekle isminde void bir method oluşturun ve parametresi int ArrayList olsun.

// Methodun içinde,
bu method, Arraylistin içine 0'dan 20 ye kadar random değer atasın.
Eğer çift sayı atarsa, o elemanın yerine 111 yazsın.
Eğer çift sayı yoksa "Çift sayı yoktur " mesajını versin.



Konsol örnegi:
İlk hali = [14, 19, 14, 2, 1, 20, 9, 9, 19, 19]
Çift sayılar yerine 111 =   [111, 19, 111, 111, 1, 111, 9, 9, 19, 19]

     */

        ArrayList<Integer> arrayList = new ArrayList<>();

        RandomEkle(arrayList);

    }

    public static void RandomEkle(ArrayList<Integer> arrayList) {

        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 20 + 1));
        }
        System.out.println("İlk hali :   " + arrayList);
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.set(i, 111);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Çift sayı yoktur...");
        }

        System.out.println("Çift sayılar yerine111=" + arrayList);


    }
}