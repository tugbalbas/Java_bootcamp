package Gun19;

public class _06_Java2DArray {
    public static void main(String[] args) {
        // 2 boyutlu 3x4 diziyi random 1-10 arası sayılarla doldurup,
        // başka döngüde yazdırınız.

       int[][] tablo=new int[3][4];

        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                tablo[satir][sutun]=(int) (Math.random()*10);
            }
        }
        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                System.out.println(tablo[satir][sutun]+" ");
            }
            System.out.println();
        }


    }
}