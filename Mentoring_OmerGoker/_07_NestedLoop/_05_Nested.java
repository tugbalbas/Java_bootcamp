package Mentoring_OmerGoker._07_NestedLoop;

public class _05_Nested {
    public static void main(String[] args) {
//         ***********
//          *********
//           *******
//            *****
//             ***
//              *

        for (int i = 6; i > 0 ; i--) {
            //bosluklari
            for (int j = 0; j <6-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
