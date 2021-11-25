package Gun21;

public class _03_Tablo {
    public static void main(String[] args) {
        //  Düzensiz diziler

        int[][] tablo1={
                {1,2},
                {2,3,1} ,
                {5,5,5,4,8} ,
                {2,10,5}};

        System.out.println("tablo1.length = " + tablo1.length); // satır sayısı
        System.out.println("tablo1[0].length = " + tablo1[0].length); // 1. satırın eleman sayısı
        System.out.println("tablo1[1].length = " + tablo1[1].length); // 2. satırın eleman sayısı
        System.out.println("tablo1[2].length = " + tablo1[2].length); // 3. satırın eleman sayısı
        System.out.println("tablo1[3].length = " + tablo1[3].length); // 4. satırın eleman sayısı

        for (int satir = 0; satir < tablo1.length; satir++)
        {
            for (int sutun = 0; sutun < tablo1[satir].length; sutun++)
            {
                System.out.print(tablo1[satir][sutun]+" ");
            }
            System.out.println();
        }
    }
}
