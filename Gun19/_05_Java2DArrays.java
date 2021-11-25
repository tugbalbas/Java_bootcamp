package Gun19;

public class _05_Java2DArrays {
    public static void main(String[] args) {
        // 2 ders ve 3 öğrencinin notlarını tek bir değişkende tablo gibi
        // nasıl tutarız, bunu 2 tane ayrı ayrı tek boyutlu dizi ile yapabiliriz
        // fakat burdaki verile birbiriyle ilşkili olduğundan , kullanması
        // zor olacaktır. Buradaki gibi TABLO ve daha fazla boyutlu durumlar için
        // dizilerin 2 veya daha fazla boyutlu hali kullanılır.
        // 2 boyutlu dizilere EXCEL tablosunu örnek verebiliriz ve satranç
        // tahtasını.Buradaki verilere ulaşmak için, tek boyutlu dizlerdeki gibi
        // tek bir indexle değil, 2 indexle ulaşırız.Bunlara SATIR ve SUTUN
        // diyeceğiz. Şimdi yukarıdaki örneği yapmaya çalışalım.


        int[] dizi1=new int[3]; // 1 boyutlu dizi tanımlaması
        int[] dizi2={2,4,5,6};  // 1 boyutlu diziye başlangıç değerleri verereke tanımlanması

        //2 ders ve 3 öğrenci -> 2 ye 3 lük bir tablo demek  yani 2 satır 3
        // sütunluk bir tablo .
        int[][] tablo1=new int[2][3]; //2 satır 3 sütunluk toplam 6 kutucuğu olan tablo
        int[][] tablo2= { {1,3,5} , {45,6,7}  }; // 2 ve 3 lük hem tanımlama hem başlangıç verisini atama

        // 2 boyutlu tabloyu nasıl yazdırız ?
        for(int satir=0; satir<2; satir++)
        {
            for(int sutun=0;sutun<3; sutun++)
            {
                System.out.print(tablo2[satir][sutun]+" ");
                // 00,01,02  sonra 10,11,12
            }
            System.out.println();
        }

        // bütün notların toplamı
        int toplam=0;
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                toplam+=tablo2[satir][sutun];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
