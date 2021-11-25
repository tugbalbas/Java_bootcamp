package Gun17;

public class _10_JavaLabeledLoop {
    public static void main(String[] args) {
        // break ve continue sadece içinde bulunduğu döngüyü etkiler.

        // iç içe döngülerde , içteki bir değişkenin değerine göre dış döngüyü kırmak için
        // (continue da olabilir)  döngülere isim (etiket yani label) verilir.
        // ve break veya continue çalıştırılırken bu isim yazılarak istenilern döngü için
        // etki (break ve continue) oluşturulur.

        dis_dongu : for(int i=1; i< 10; i++)  // dis_dongu diye isim yani LABEL verilir.
        {
            for (int j=1; j<10 ;j++)
            {
                if (j==3) break dis_dongu;
                // madem öyle eğer gerekirse içerideki döngüden dışardaki döngüyü nasıl kırarım ?

                System.out.println("i="+i+", j="+j);
            }

            System.out.println();
        }

    }
}