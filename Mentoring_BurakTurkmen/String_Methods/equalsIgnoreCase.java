package Mentoring_BurakTurkmen.String_Methods;

public class equalsIgnoreCase {
    public static void main(String[] args) {

        String firstName="Tuğba";
        String firstName2="tUğBa";
        String lastName="Albaş";

        System.out.println(firstName.equalsIgnoreCase(firstName2));
        System.out.println(firstName.equalsIgnoreCase(lastName));


    }
}
