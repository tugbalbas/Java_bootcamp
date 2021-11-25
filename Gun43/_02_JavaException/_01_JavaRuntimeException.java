package Gun43._02_JavaException;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program çalıştı");
        String kelime="";

        kelime.charAt(3); // (_01_JavaRuntimeException.java:9)
    }
}
// Derleme Zamanı hatası denir : Compile Error, Exception // başlamadan
// Çalışma Zamanı hatası denir : Runtime Error, Exception // başladı, çalışırken
