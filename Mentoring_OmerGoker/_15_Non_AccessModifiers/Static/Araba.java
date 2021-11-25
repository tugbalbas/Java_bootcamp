package _15_Non_AccessModifiers.Static;

public class Araba {

    int model;
    String marka;
    private static int aracsayisi;

    Araba(int model, String marka){
        this.model=model;
        this.marka=marka;
        aracsayisi++;

    }

    public static  int getAracsayisi(){

        return aracsayisi;
    }

    public static void main(String[] args) {

        System.out.println("baslangicta arac sayisi : "+Araba.getAracsayisi() );
       // System.out.println("baslangicta arac sayisi : "+getAracsayisi() );

        Araba araba1=new Araba(2020,"Mercedes");
        System.out.println("baslangicta arac sayisi : "+getAracsayisi() );
        Araba araba2=new Araba(2021,"BMW");
        System.out.println("baslangicta arac sayisi : "+getAracsayisi() );
    }
}

// class Uret{
//     public static void main(String[] args) {
//         Araba.getAracsayisi();
//     }
//
//
// }