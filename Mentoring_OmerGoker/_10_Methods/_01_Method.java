package Mentoring_OmerGoker._10_Methods;

public class _01_Method {

    public static void main(String[] args) {

        // f(x) = 2x+3 Java da ki methodlar matematikteki fonksiyonlar gibi.

          //f(3)=9
        //5+ f(3) +2 =
        //5+ 9 +2 =

        // parametresiz method

        System.out.println( "Adim 1" );
        printGoodMorning();

        System.out.println( "Sonraki adim" );

        printGoodMorning();

        System.out.println( "Bir baska adim" );
        printGoodMorning();


    }
    // access modifiers + static + return type + method name ( parameters) {code}
    //void is return type which returns nothing
    public static void printGoodMorning() {
        // burada uzun bir kod oldugunu varsayalim
        System.out.println( "Good Morning!!!" );
    }


}
