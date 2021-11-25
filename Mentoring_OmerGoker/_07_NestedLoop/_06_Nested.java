package Mentoring_OmerGoker._07_NestedLoop;

public class _06_Nested {
    public static void main(String[] args) {

//      *
//     **
//    * *
//   *  *
//  *   *
// *    *
//*******

        for (int i = 1; i <= 7; i++)
        {
            // bosluk icin
            for (int j = 1; j <= 7 - i; j++)
                System.out.print(" ");

            // '*' icin
            for (int k = 1; k <= i; k++)
            {
                // kenarlarda "*" yazmak icin
                if (i == 7 || k == 1 || k == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


            System.out.println();
        }






    }
}
