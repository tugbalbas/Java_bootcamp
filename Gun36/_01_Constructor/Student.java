package Gun36._01_Constructor;

public class Student {
    int id;  // this ile gösterilir ki karışmasın
    String name;
    String surname;
    int classroom;

    //görünmeyenler
    // Constructor : yapıcı method
    // new olduğu anda çalışan METHOD

    public Student(){
        System.out.println("nesne oluşturuldu");
    }

    public Student(int id, String name, String surname, int classroom){
        // 1.id classın kendi değişkeni
        // 2. değişken methoda gelen değişken
        // isimler aynı olunca karışmasın diye
        // burdaki manasında classı işaret etmek için
        // this kelimesi kullanılır.
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;
    }

    public Student(int id, String name, String surname){
        this(id,name,surname,0); // tek satırda böyle yazdırıyoruz
//        this.id=id;
//        this.name=name;
//        this.surname=surname;
//        this.classroom=0;
    }
    public Student(int id, String name){
//        this.id=id;
//        this.name=name;
//        this.surname="";
//        this.classroom=0;
        this(id,name,"",0);
    }
    public Student(int id ){
        this(id,"","",0);
    }
















// Nesne oluşturmanın 2.Yöntemi (static)
 public static Student createStudent(int id,String name,String surname,int classroom) {
     Student ogrenci1 = new Student();
     ogrenci1.id = id;
     ogrenci1.name = name;
     ogrenci1.surname = surname;
     ogrenci1.classroom = classroom;

     return ogrenci1;
 }
}