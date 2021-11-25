package Mentoring_OmerGoker._14_Constructors._04_Constructor_Questions.Q4;

public class Student {
    int id;
    String name;
    int age;
    Student(){
    }
    Student(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(234,"Ayse",29);
        s1.display();
        s2.display();
    }
}
//0 null 0
//234 Ayse 29