package Mentoring_OmerGoker._09_2Darrays;

import java.util.Arrays;

public class _05_2D_Array {


    public static void main(String[] args) {






//        String[][] books = {
//                {"Marvel", "DC"},
//                {"The Lord of the rings", "Star war", "Harry Potter"},
//                {"War and peace", "Anna Karenina", "Faust"},
//                {"Saw"}
//        };
//
//
//
//        System.out.println( "satir: " + books.length );
//        System.out.println( "0 indexli satir daki eleman sayisi (sutun sayisi): " + books[0].length);
//        System.out.println( "3 indexli satir eleman sayisi(sutun sayisi)" + books[3].length);
//
//
//
//        // kac kitap oldugunu bulalim
//
//          int toplam=0;
//
//        for (int i = 0; i <books.length ; i++) {
//
//            for (int j = 0; j <books[i].length ; j++) {
//                System.out.println(books[i][j]);
//                toplam++;
//            }
//        }
//        System.out.println("toplam = " + toplam);
//

        String[] cizgi_roman = {"Marvel", "DC"};
        String[] kurgu = {"The Lord of the rings", "Star war", "Harry Potter"};
        String[] klasik = {"War and peace", "Anna Karenina", "Faust"};
        String[] korku = {"Saw", "Sinister", "Friday 13"};


          String [][] arr2= new String[4][3];

          arr2[0]=cizgi_roman;
          arr2[1]=kurgu;
          arr2[2]=klasik;
          arr2[3]=korku;

        for (int i = 0; i <arr2.length ; i++) {

            System.out.println(Arrays.toString(arr2[i]));
        }

    }





}
