package Gun17;

public class _06_JavaNestedLoop {
    public static void main(String[] args) {
        // Günün sorusu
        // Aşağıdaki görüntüyü veren programı yazınız
        //     *  -> 1.Satırda 4 bosluk 1 yıldız
        //    **  -> 2.Satırda 3 boşluk 2 yıldız
        //   ***  -> 3.Satırda 2 boşluk 3 yıldız
        //  ****  -> 4.Satırda 1 boşluk 4 yıldız
        // *****  -> 5.Satırda 0 boşluk 5 yıldız.

        for(int satir=1; satir<=5; satir++)
        {

            for(int bosluk=1; bosluk <= 5-satir ; bosluk++) { //  int bosluk=5-satir   bosluk>0   bosluk--
                System.out.print("_");}

            for (int sutun = 1; sutun <= satir; sutun++){
                System.out.print("*");}


            System.out.println();
        }
    }
}