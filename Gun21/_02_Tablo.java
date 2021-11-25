package Gun21;

public class _02_Tablo {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

//        int[][] tablo1={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
//
//        int max=tablo1[0][0];
//        for (int satir=0; satir<4 ; satir++) {
//
//            for (int sutun=0; sutun<3; sutun++) {
//
//                if (tablo1[satir][sutun]> max)
//                    max=tablo1[satir][sutun];
//            }
//        }
//        System.out.println("max = " + max);

        int[][] mat={{1,2,3},{2,3,1},{5,5,5},{2,10,3}};

        int max=mat[0][0];

        for (int i=0; i<mat.length; i++) //mat.length => satır sayısını verir yani 'i<4;'
        {
            for (int j=0; j<mat[i].length; j++) //  3 ün yerine mat[i] satırı temsil ediyor mat[i].length 'j<3;'
            {
                if (mat[i][j] > max)
                    max=mat [i][j];
            }
        }
        System.out.println("max = " + max);
    }
}
