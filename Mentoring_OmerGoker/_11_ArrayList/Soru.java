package Mentoring_OmerGoker._11_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
            /*
        Scanner oluşturun ve bir arraylistin kaç elemandan oluşacagını belirleyin.
        Daha sonra bu elemanları siz girin. (Buraya kadar full scanner ile calısıyoruz)

        Daha sonra bir method oluşturun ve bu methodda parametresi  int arraylist olsun.
        Ve arraylist içerisindeki tüm sayıları birbiri ile toplasın.
        Bu methodu main methodunda cagırıp oluşturdugunuz arraylist için deneyin.

        Konsol görüntüsü ornek:
        Kaç eleman olsun :
5
Eleman girin :
1
Eleman girin :
2
Eleman girin :
3
Eleman girin :
4
Eleman girin :
5
15
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç eleman olsun : ");
        int elemanSayisi=sc.nextInt();

        for (int i = 0; i < elemanSayisi; i++) {

            System.out.println("Eleman girin: ");
            arrayList.add(sc.nextInt());
        }

        System.out.println(metod(arrayList));

    }

    public static int metod(ArrayList<Integer> arrayList){ // ben bir method oluşturuyorum. Bu method içerisine yazılan arraylistin elemanlarının toplamını yazıyor

        int sum=0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum+=arrayList.get(i);
        }
        return sum;
    }
}
