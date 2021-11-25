package Mentoring_OmerGoker._07_NestedLoop;

public class _09_Nested {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        for (int i = 1; i <= 5; i++) {

            int x=i;

            for (int k = 1; k <= i; k++)
            {
                System.out.print(x + " ");
                x = x + (5- k);
            }

            System.out.println();
        }





    }
}
