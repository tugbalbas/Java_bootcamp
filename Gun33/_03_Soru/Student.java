package Gun33._03_Soru;

import java.util.ArrayList;

public class Student {
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields: name, maxCredit, dersleri listesini
    // tutacak bir liste
    String name;
    int maxCredit;
    ArrayList<Lesson>dersListesi;

    //Toplam kredi
    public int toplamKredisi(){
        int toplamKredi=0;

        for (Lesson les: dersListesi) {
            toplamKredi+=les.credit;
        }

        return toplamKredi;
    }

//    public in

}
