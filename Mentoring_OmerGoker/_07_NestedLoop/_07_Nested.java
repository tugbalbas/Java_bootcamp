package Mentoring_OmerGoker._07_NestedLoop;

public class _07_Nested {
    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        for (int i = 1; i <= 6 ; i++) {

            for (int j = 1; j < i ; j++) {

                System.out.print(" ");
            }
            for (int k = i; k <= 6; k++) {

                System.out.print(k+ " ");
            }

            System.out.println();

        }




    }

}
