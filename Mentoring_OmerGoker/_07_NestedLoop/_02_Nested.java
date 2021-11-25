package Mentoring_OmerGoker._07_NestedLoop;

public class _02_Nested {


    public static void main(String[] args) {


        // 1               //distaki dongu satirlari ic teki dongu sutunlari
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5


        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print( j +" ");
            }

            System.out.println();

        }


    }
}
