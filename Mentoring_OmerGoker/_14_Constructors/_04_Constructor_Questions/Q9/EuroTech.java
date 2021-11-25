package Mentoring_OmerGoker._14_Constructors._04_Constructor_Questions.Q9;

public class EuroTech {
    int num;
    String name;
    EuroTech(){
        System.out.print("Euro Tech ");
    }
}

class Techno{
    public static void main(String[] args) {
        EuroTech student1=new EuroTech();
        System.out.print(student1.name);
        System.out.print(student1.num);
    }
}
