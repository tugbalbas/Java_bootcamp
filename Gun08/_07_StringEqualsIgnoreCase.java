package Gun08;

public class _07_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase("MerHABA"));
    }
}
