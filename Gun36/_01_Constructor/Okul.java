package Gun36._01_Constructor;

public class Okul {
    // Bir Student sınıfı oluşturunuz
    // (id, name, surName, classroom) ve
    // bundan 7 adet öğrenci oluşturunuz.

    public static void main(String[] args) {

        // Nesne oluşturmanın 1.Yöntemi
        Student ogr1=new Student();
        ogr1.id=1;
        ogr1.name="Sevim";
        ogr1.surname="Yılmaz";
        ogr1.classroom=9;

        // Nesne oluşturmanın 2.Yöntemi (static)
        Student ogr2=Student.createStudent(2,"İlhan","Demir",8);

        // Nesne oluşturmanın 3.Yöntemi yeni!!
        Student ogr3=new Student(3, "Mehmet","Deniz",4); // tanımlama anında çalışan methoodlar var aslında
                                    // ama sen kullanmadığın için ben de göstermiyorum
        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4=new Student(4, "Ragıp","Bayrak");
        Student ogr5=new Student(4, "Ragıp");
        Student ogr6=new Student(4 );
    }
}