package _16_StringBuffer_StringBuilder;

public class _01_StringBuilder_Buffer {

   /*
   todo
    Stringler immutable dir. yani degistirilemez.

    */


    public static void main(String[] args) {


        int a=5;

      String str="bjk";
      str="fdsfd";


      char chr[] ={'b','j','k'};

      String str2 =new String(chr);

//        System.out.println(str);
//        System.out.println(str2);


        String mystring ="yazili bir ifade 1";
        String mystring2= new String("yazili bir ifade 2");
        String mystring3 =new String(mystring);

        String ilkstring ="ilk";
        String ikincistring ="ikinci";
        ilkstring.concat(ikincistring);
        System.out.println(ilkstring);
         ilkstring= ilkstring.concat(ikincistring);//atama yapmak gerekiyor
        System.out.println(ilkstring);


    }
}
