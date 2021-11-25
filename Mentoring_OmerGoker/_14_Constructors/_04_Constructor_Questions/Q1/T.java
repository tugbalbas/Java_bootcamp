package Mentoring_OmerGoker._14_Constructors._04_Constructor_Questions.Q1;

public class T {
    int t = 20;

    T() {
        t = 40;
    }
}
class Main {
    public static void main(String args[]) {
        T t1 = new T();
        System.out.println(t1.t); // T Classının t1 objesinin t fieldı 40
    }
}

