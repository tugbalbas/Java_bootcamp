package Mentoring_OmerOzdemir._11_Enum.Days;

public class App {
    //27/03/2021

     /*
    days isminde enum class oluşturun ve haftanın günlerini yazınız.
    Months isminde enum class oluşturun ve ayları yazınız. Parametre olarak ta kaçıncı ay oldugunu yazınız. örn: OCAK(1)

    1-)main class ta ise günlerden salıyı seçip yazdırınız.

    2-)  Herhangi bir ayı seçip konsola şunu yazdırınız:

    Nisan yılın 4. ayıdır.
     */
     public static void main(String[] args) {
         Days days=Days.Cuma;
         System.out.println(days);

         Months m=Months.AGUSTOS;
         System.out.println("Aylardan "+m+"ve bu ay"+m.getAy()+". aydır");
     }
}
