package _15_Non_AccessModifiers.Static;

public class StaticModifier {

      //instance özelligi/variable/field
      public int a;

     //class ozelligi /variable /field
      public static int b;

      /*
      todo
        1- static degiskenler ve metotlar siniflara aittir.
        2- Ayri bir nesne(instance) olusturmadan kullanabilir
        3- static metot icinden static field ve static metod cagirabilir
       */

    public void artis(){
        a++;
        b++;

    }

    public static void main(String[] args) {
        StaticModifier s1=new StaticModifier();

        s1.artis();
        System.out.println(s1.a);
        System.out.println(s1.b);
      //  System.out.println(b);

        StaticModifier s2=new StaticModifier();

        s2.artis();
        System.out.println(s2.a);
        System.out.println(s2.b);


       System.out.println("s1"+ s1.b);

        StaticModifier s3=new StaticModifier();
        s3.artis();
        System.out.println(s3.a);

        System.out.println(s3.b);
          System.out.println( "s1"+ s1.b);
    }

}

