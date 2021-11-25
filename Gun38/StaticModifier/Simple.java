package Gun38.StaticModifier;

public class Simple {
    int a;   // oluşturulacak nesneye ait değişken
    static int b;   // Classa ait değişken nesneye DEĞİL!!

    void arttir(){
        a++;
        b++;
    }

    public static void main(String[] args) {
        Simple ornek1=new Simple();
        ornek1.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;

        Simple.b=6; // aynı methodlarda olduğu gibi direkt CLASS ADI ile ulaşılır
        Simple.b=8;

        System.out.println("ornek1 = " + ornek1.a); // 5
        System.out.println("ornek2.a = " + ornek2.a);
        System.out.println("Simple.b = " + Simple.b); // 8

        ornek1.arttir(); // b=9;
        ornek2.arttir(); // b=10;

        System.out.println("ornek1 = " + ornek1.a); // 6
        System.out.println("ornek2.a = " + ornek2.a); // 8
        System.out.println("Simple.b = " + Simple.b); // 10

    }
}

//        ornek1 = 5
//        ornek2.a = 7
//        Simple.b = 8
//        ornek1 = 6
//        ornek2.a = 8
//        Simple.b = 10
