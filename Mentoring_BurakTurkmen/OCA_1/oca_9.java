package Mentoring_BurakTurkmen.OCA_1;

public class oca_9 {

    static int count = 0; //static varsa o değer devam ediyor
    int i = 0;            // static yoksa 0'lanıyor.

    public void changeCount(){
        while (i < 5) { //5
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        oca_9 check1 = new oca_9();
        oca_9 check2 = new oca_9();

        check1.changeCount();  //count=5    i=5 -- işlem bitince 0'lanıyor.
        check2.changeCount();  //count=10   i=5
        System.out.println(check1.count + " : " + check2.count);
    }


    /*

    A) 10 : 10 ****
    B) 5 : 5
    C) 5 : 10
    D) Compilations fails



     */

}
