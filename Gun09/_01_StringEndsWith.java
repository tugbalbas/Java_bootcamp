package Gun09;

public class _01_StringEndsWith {
    public static void main(String[] args) {
        // endsWith : ... ile bitiyor mu? sonuç boolean

        String text="Merhaba Dünya";
        System.out.println("ya ile bitiyor mu? =" + text.endsWith("ya"));
        System.out.println("a ile bitiyor mu? =" + text.endsWith("a"));
        System.out.println("A ile bitiyor mu? =" + text.endsWith("A"));
        System.out.println("ba ile bitiyor mu? =" + text.endsWith("ba"));
        System.out.println("y ile bitiyor mu? =" + text.endsWith("y"));
    }
}
