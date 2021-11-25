package Gun09;

public class _10_JavaArithmeticOperators {
    public static void main(String[] args) {
        // Çarpma,bölme,modül

        int a=10;
        int b=5;

        System.out.println("Çarpma işlemi");
        System.out.println("a*b="+(a*b));

        System.out.println("Bölme işlemi");
        System.out.println("a/b="+(a/b));

        System.out.println("Modül işlemi");
        System.out.println("a%b="+(a%b)); // Modül, 10%5 bölümünden kalan demek. 0
        System.out.println("b%a="+(b%a)); // Modül, 5%10 soldaki sayı küçük ise sonuç  soldaki sayıdır 5
    }
}
