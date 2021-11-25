package Gun43._01_StringBuilder_StringBuffer;

public class ParalelCalismayaOrnek {
    static String cumle="";

    public static void main(String[] args) {
        kelimeEkle1(); // önce bu çalışıyor
        kelimeEkle2(); // sonra bu çalışıyor

        // bilgisayar bu denilebilir
        //kelimeEkle1(); aynı anda  kelimeEkle2();


        System.out.println("cumle = " + cumle);
    }

    private static void kelimeEkle1()
    {
        cumle +=" ders";
    }

    private static void kelimeEkle2()
    {
        cumle +=" başladı";
    }
}
