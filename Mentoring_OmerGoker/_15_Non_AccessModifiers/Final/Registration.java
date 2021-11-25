package _15_Non_AccessModifiers.Final;

public class Registration {


    public void register(Person person) {
        System.out.println("Name1: " + person.name);
        person.name = "Eymen";
        System.out.println("Name2: " + person.name);

        System.out.println("Fingerprint code1: " + person.fingerprintcod);

        //person.fingerprintCode = 0004;
        System.out.println("Fingerprint code2: " + person.fingerprintcod);
    }


    public static void main(String[] args) {
        Registration reg = new Registration();

        Person person1 = new Person("Orhan", 43534);
        reg.register(person1);
    }


}
