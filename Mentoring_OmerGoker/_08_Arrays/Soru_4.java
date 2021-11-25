package Mentoring_OmerGoker._08_Arrays;

public class Soru_4 {
    public static void main(String[] args) {
        // Double Array'indeki elemanları for each döngüsüyle toplayınız

        double[] doubleArrayi= {5.0, 5.0, 5.0, 5.0, 5,0};
        double toplam=0;

        for (Double yeniDouble : doubleArrayi) {
            toplam+=yeniDouble;
        }
        System.out.println("toplam = " + toplam);
    }
}
