package Mentoring_OmerOzdemir.Methods;

public class _2_ {
    /*
    Çallışan bilgilerini ekrana yazdıran bir method oluşt
    Bilgiler: isim soyisim departman

    Her çalışan bilgisinden sonra düz bir çizgi çeken bir method oluşturun

    Bu methodu main methodda çağırın ve değerleri main method içerisinde verin.

     */
    public static void main(String[] args) {
        baslik("ÇALIŞAN BİLGİLERİ");
        duzCizgi();
        bilgiler("Tugba","Albas","QA");
        duzCizgi();
        bilgiler("Ömer","Özdemir","SOFTWARE");
    }

    public static void bilgiler(String isim,String soyisim,String departman){

        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        System.out.println("departman = " + departman);

    }

    public static void duzCizgi(){

        System.out.println("---------/////----------");

    }
    public static void baslik(String a){

        System.out.println(a);

    }
}
