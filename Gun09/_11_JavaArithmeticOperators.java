package Gun09;

public class _11_JavaArithmeticOperators {
    public static void main(String[] args) {
        // arttırma ve azaltma operatörü
        int a=5;
        int b=2;
        int k=0;

        a++; // a nın değerini 1 arttır => a=a+1 le aynı -> 6
        ++a; // a nın değerini 1 arttır => a=a+1 le aynı -> 7

        k = a++; // ++ lar sağda old için , önce k=a çalışır , daha sonra a=a+1 çalışır -> k=7 , a=8
        k = ++a; // ++ lar solda old için , önce a=a+1 çalışır , daha sonra k=a olur; -> a=9 , k=9

        a--; // a nın değerini 1 azaltır => a=a-1 le aynı -> 8
        --a; // a nın değerini 1 azaltır => a=a-1 le aynı ->7

        k = a--; // -- ler sağda old için, önce k=a çalıışır, sonra a=a-1 ;k=7, a=6
        k = --a; // -- ler solda old için, önce a=a-1 çalışır, daha sonra k=a ;a=5 , k=5


//        ++ veya -- değişkenin sağındaysa: önce işlemleri yap,
//        sonra değişkenin değerini 1 artır veya azalt
//
//        ++ veya -- değişkenin SOLUNDAYSA: önce değişkenin
//        kendi değerini 1 artır veya azalt sonra işlemleri yap

    }
}
