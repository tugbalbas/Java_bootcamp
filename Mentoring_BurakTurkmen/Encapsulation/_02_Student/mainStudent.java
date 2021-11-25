package Mentoring_BurakTurkmen.Encapsulation._02_Student;

public class mainStudent {
    public static void main(String[] args) {

        Student student1 = new Student();

        //set
        student1.setStudentName("Burak");
        student1.setStudentNumber(345);
        student1.setStudentAge(14);

        //get - print
        System.out.println("Öğrencinin adı: "+student1.getStudentName());
        System.out.println("Öğrencinin numarası: "+student1.getStudentNumber());
        System.out.println("Öğrencinin yaşı: "+student1.getStudentAge());
    }
}
