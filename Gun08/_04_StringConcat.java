package Gun08;

public class _04_StringConcat {
    public static void main(String[] args) {
        // Bir stringi diğerine ekler
        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("s1.concat(s2) = " + s1.concat(s2)); // s1+s2 ile aynı
        System.out.println("s1.concat(s2) = " + s1.concat(" ").concat(s2));

        System.out.println("s1 = " + s1); // yukardaki işlemler ile s1 ve s2nin değerleri değişmez
        System.out.println("s2 = " + s2);

        s1=s1.concat(s2); // ancak atanırsa değişir
        System.out.println("s1 = " + s1); // MerhabaDünya
    }
}
