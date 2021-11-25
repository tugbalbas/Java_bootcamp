package Gun09;

public class _12_JavaArithmeticOperators {
    public static void main(String[] args) {
        int a=10;

        int sonuc= a +   ++a    +     a++     +     --a      -      a--;
        //           10     11          11             10              10 => 32
        System.out.println("sonuc = " + sonuc);
        System.out.println("a = " + a);

//        ++ veya -- değişkenin sağındaysa: önce işlemleri yap,
//        sonra değişkenin değerini 1 artır veya azalt
//
//        ++ veya -- değişkenin SOLUNDAYSA: önce değişkenin
//        kendi değerini 1 artır veya azalt sonra işlemleri yap

    }
}
