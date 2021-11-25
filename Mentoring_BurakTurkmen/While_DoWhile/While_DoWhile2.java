package Mentoring_BurakTurkmen.While_DoWhile;

public class While_DoWhile2 {
    public static void main(String[] args) {

//      belli bir sayiya kadar olan sayilarin toplami
        int sayi=1;
        int toplam=0;

        while (sayi<=10){
            toplam=toplam+sayi;
            //1     0      1
            //3     1      2
            //6     3      3
            //10    6      4
            sayi++;
            //5
        }
        System.out.println("toplam = " + toplam);
    }
}
