package Mentoring_BurakTurkmen.String_Methods;

public class StartsWith {
    public static void main(String[] args) {
        String baslangic="Galaksi";
        System.out.println(baslangic.startsWith("Ga"));
        System.out.println(baslangic.startsWith("lak"));
        System.out.println(baslangic.startsWith("si"));

        System.out.println("-------------------------------");

        System.out.println(baslangic.endsWith("Ga"));
        System.out.println(baslangic.endsWith("lak"));
        System.out.println(baslangic.endsWith("si"));
    }
}
