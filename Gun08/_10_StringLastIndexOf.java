package Gun08;

public class _10_StringLastIndexOf {
    public static void main(String[] args) {
        // indexOf la aynı şekilde çalışır sadece sondan itibaren 
        // ilk bulduğunun INDDEX ini verir
        
        String s1="Merhaba";

        System.out.println("Baştan a nın Indexi = " + s1.indexOf("a")); // 4
        System.out.println("Sondan a nın Indexi = " + s1.lastIndexOf("a")); // 6

        String s2="Good";
        System.out.println("Baştan o nın Indexi  = " + s2.indexOf("o")); // 1
        System.out.println("Sondan o nın Indexi = " + s2.lastIndexOf("o")); // 2

    }
}
