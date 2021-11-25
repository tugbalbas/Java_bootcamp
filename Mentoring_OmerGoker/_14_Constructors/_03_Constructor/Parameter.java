package Mentoring_OmerGoker._14_Constructors._03_Constructor;

public class Parameter {
    /*
   Constructorlar parametreli olabilir fakat değer döndürmezler
   Bir class birden cok constructor tanımlayabilirim
   Bunlar aldiklari parametreye göre ayırt edilir
   Constructorlar birbirlerini cagirabilirler

     */
    public static void main(String[] args) {
        Futbolcu futbolcu=new Futbolcu("Abubakar",29,"Forvet",10000000);
        System.out.println("futbolcu.ad = " + futbolcu.ad);
        System.out.println("futbolcu.yas = " + futbolcu.yas);
        System.out.println("futbolcu.mevki = " + futbolcu.mevki);
        System.out.println("futbolcu.bonservisBedeli = " + futbolcu.bonservisBedeli);

        Futbolcu futbolcu2=new Futbolcu("Atiba",38);
        System.out.println("futbolcu2.ad = " + futbolcu2.ad);
        System.out.println("futbolcu2.yas = " + futbolcu2.yas);
        System.out.println("futbolcu2.mevki = " + futbolcu2.mevki);
        System.out.println("futbolcu2.bonservisBedeli = " + futbolcu2.bonservisBedeli);

    }
}
