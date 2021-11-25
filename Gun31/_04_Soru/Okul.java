package Gun31._04_Soru;

import java.util.ArrayList;

public class Okul {
    public static void main(String[] args) {
        // 2. KISIM
        Student ogr1=new Student();
        ogr1.name="Ahmet";
        ogr1.not=70;

        Student ogr2=new Student();
        ogr2.name="Ayşe";
        ogr2.not=80;

        Student ogr3=new Student();
        ogr3.name="Kaya";
        ogr3.not=75;

        ArrayList<Student> ogrler=new ArrayList<>();
        ogrler.add(ogr1);
        ogrler.add(ogr2);
        ogrler.add(ogr3);

        bilgiYazdir(ogrler);
        System.out.println("ortalama: " + OrtalamaBul(ogrler));
    }

    public static void bilgiYazdir(ArrayList<Student>ogrler){
        for (Student ogr : ogrler) {
            System.out.println("ogr ve not = " + ogr.name +" - "+ ogr.not);
        }
    }
    public static double OrtalamaBul(ArrayList<Student> ogrler){
        double ort = 0;
        double toplam= 0;
        for (Student ogr: ogrler){
            toplam += ogr.not;
        }
        ort = toplam/ogrler.size();

        return ort;
    }

}
// 1. KISIM
class Student{
    String name;
    int not;
}



// 1) create class student with fields: string name, int not
// 2) Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
// 3) Daha öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
// 4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.