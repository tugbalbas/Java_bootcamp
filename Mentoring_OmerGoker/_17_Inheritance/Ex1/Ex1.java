package _17_Inheritance.Ex1;

public class Ex1 {
    public static void main(String[] args) {

        SuperClass superClass=new SubClass();
        superClass.name="Super Class/ Parent";
        System.out.println(superClass);

        SubClass subClass=new SubClass();
        subClass.name="Sub Class / Child";
        System.out.println(subClass);



    }


}
