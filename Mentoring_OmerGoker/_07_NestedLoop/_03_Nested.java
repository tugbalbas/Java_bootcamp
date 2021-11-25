package Mentoring_OmerGoker._07_NestedLoop;

public class _03_Nested {

    public static void main(String[] args) {

//         A
//         A B
//         A B C
//         A B C D
//         A B C D E
//         A B C D E F

       int harf = 65;

        for (int i = 0; i <=5 ; i++) {

            for (int j = 0; j <= i ; j++) {
                                        //65+0
                System.out.print((char)(harf+j)+" ");
            }
            System.out.println();
        }


    }
}
