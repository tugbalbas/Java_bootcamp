package Mentoring_OmerGoker._09_2Darrays;

import java.util.Arrays;

public class _01_2D_Array {


    public static void main(String[] args) {


         //                   0     1     2
         //                  mat   fen   turk
         //     *****************************
         //     0   ahmet    60     78    96
         //     1   mehmet   40     55    66
         //     2   ayse     70     38    79

             int [][] arr = new int[3][3];

             arr[0][0]=60;
             arr[0][1]=78;
             arr[0][2]=96;
             arr[1][0]=40;
             arr[1][1]=55;
             arr[1][2]=66;
             arr[2][0]=70;
             arr[2][1]=38;
             arr[2][2]=79;




//        System.out.println(arr[1][1]);
//        System.out.println(Arrays.toString(arr[0]));


        for (int i = 0; i <3 ; i++) {

            for (int j = 0; j <3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}
