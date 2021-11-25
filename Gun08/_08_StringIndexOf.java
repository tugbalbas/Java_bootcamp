package Gun08;

public class _08_StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter veya karakterlerin stringin içindeki INDEX nosunu verir
        // contains bize var veya yok diyordu bu ise indexini verir yok ise -1 verir

        String s1="Merhaba Dünya";

        System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));
        System.out.println("s1.indexOf(ha) = " + s1.indexOf("ha"));
        System.out.println("s1.indexOf(ny) = " + s1.indexOf("ny"));
        System.out.println("s1.indexOf( ) = " + s1.indexOf(" "));
        System.out.println("s1.indexOf(k) = " + s1.indexOf("k"));
        System.out.println("s1.indexOf(a) = " + s1.indexOf("a"));
        System.out.println("s1.indexOf(A) = " + s1.indexOf("A"));

    }
}
