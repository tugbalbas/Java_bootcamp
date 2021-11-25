package Gun05;

public class _05_ScopeInceleme {
    public static void main(String[] args) {

        int a = 5; // a aşağıdaki scopun dışında old için global gibi oluyor
        // her yerde geçerli oluyor

        { // bu parantezlerin arasında tanımlanan değişkenler sadece burada geçerli olur
            // b sadece bu parantezler arasında geçerli(Scope)
            int b = 75;
            System.out.println("b = " + b);
            System.out.println("a = " + a);

        }
        // b=80; b değişkeni sadece yukarıdaki scopeda geçerli
        System.out.println("a = " + a);
    }
}
