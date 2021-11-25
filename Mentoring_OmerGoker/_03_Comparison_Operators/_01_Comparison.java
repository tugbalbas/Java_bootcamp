package Mentoring_OmerGoker._03_Comparison_Operators;

public class _01_Comparison {


    /*

    ==	    Esit	            x == y
    !=	    Esit degil	        x != y
    >	    buyuk	            x > y
    <	    kucuk	            x < y
    >=	    buyuk esit        	x >= y
    <=	    kücük esit  	    x <= y

     */

    public static void main(String[] args) {

        int a = 15;
        int b = 20;

        System.out.println( "a esit b: " + (a == b) );  //false
        System.out.println( "a esit degil b: " + (a != b) ); //true
        System.out.println( "a büyük b: " + (a > b) ); // false
        System.out.println( "a kücük b: " + (a < b) ); //true
        System.out.println( "a buyuk esit b: " + (a >= b) ); //false
        System.out.println( "a kücük esit b: " + (a <= b) ); //true

        System.out.println("---------------------------------------------");



        String s1 = "techno";
        String s2 = "techno";

        System.out.println("s1 == s2 :" + s1 == s2);




    }
}
