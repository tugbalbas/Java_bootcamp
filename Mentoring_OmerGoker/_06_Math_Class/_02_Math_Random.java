package Mentoring_OmerGoker._06_Math_Class;

public class _02_Math_Random {
    /*
     Math.random()  // 0.0 ile 1.0 arasinda rastgele bir deger verir.

0.0 <= R <= 1.0
It returns a double value with a positive sign,
greater than or equal to 0.0 and less than 1.0.
     */
    public static void main(String[] args) {

        Math.random();  //0.0 ve 1.0 arasinda bir deger veriyor
        double random = Math.random();

        //eger tam sayi olarak bir deger istiyorsak *10 gibi bir sayi ile carpabiliriz.

        //eger ki bir deger araliginda olacak sekilde bir random rakam istiyorsak o zaman bize
        //verilen formulu kullanabiliriz.

        //(int) (Math.random() * ((max - min) + 1)) + min;


        // Math.random(); gives random number between 0.0 and 1.0
        System.out.println( "\nrandom: " + Math.random() );


        int min = 0;
        int max = 15;

        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(randomNumber);



    }
}

