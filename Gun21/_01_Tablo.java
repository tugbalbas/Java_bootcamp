package Gun21;

public class _01_Tablo {
    public static void main(String[] args) {
        int sayi = 0;  // bu hafızada 1 sayılık yer ayırıyor ve adına sayi diyor.
        int[] dizi = new int[5]; // bu hafızada 5 tane (0,1,2,3,4 indisli)  int yeri ayırıyor.
        int[][] tablo = new int[4][5]; // bu hafızada 4 satır ve 5 sutun şeklinde 20 tane int ayırır.

        //1.satira değer atamak için
        tablo[0][0] = 65;
        tablo[0][1] = 85;
        tablo[0][2] = 7;
        tablo[0][3] = 5;
        tablo[0][4] = 77;

        //2.satira değer atamak için
        tablo[1][0] = 6;
        tablo[1][1] = 8;
        tablo[1][2] = 76;
        tablo[1][3] = 56;
        tablo[1][4] = 7;

        // değer atama
        for (int satir = 0; satir < 4; satir++) {
            for (int sutun = 0; sutun < 5; sutun++) {
                tablo[satir][sutun] = (int) (Math.random() * 10);
            }
        }

        // ekrana yazdırma yeri
        for (int satir = 0; satir < 4; satir++) {
            for (int sutun = 0; sutun < 5; sutun++) {
                System.out.print(tablo[satir][sutun] + " ");
            }
            System.out.println();
        }


    }
}