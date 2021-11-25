package Mentoring_OmerGoker._04_Logical_Operators;

public class _01_Logical {

    /*

    && 	Logical and	Returns true if both statements are true	                x < 5 &&  x < 10
    || 	Logical or	Returns true if one of the statements is true	            x < 5 || x < 4
    !	Logical not	Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)

     */


    /*


        -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False



     */

    public static void main(String[] args) {


        boolean true1 =  true;
        boolean true2 = true;
        boolean false1 = false;
        boolean false2 = false;

        // and
        System.out.println("------------AND---------");
        System.out.println( true1 && true2 );  // true // iki ifadede dogru ise dogru olur aksi takdirde yanlis
        System.out.println( true1 && false1 ); //false
        System.out.println( false1 && false2 ); //false

        // or
        System.out.println("------------OR------------");
        System.out.println( true1 || true2 ); //true
        System.out.println( true1 || false1 ); //true
        System.out.println( false1 || false2 ); //false // iki ifade de yanlis ise yanlis olur aksi takdirde dogru

        // not
        System.out.println("-----------NOT--------------");
        System.out.println( !true1 ); // false
        System.out.println( !false1 ); //true

    }
}
