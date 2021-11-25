package _17_Inheritance;

public class Q2 {
}
class A
{
    int i = 10;
}

class B extends A
{
    int i = 20;
}

 class MainClass
{
    public static void main(String[] args)
    {
       B a = new B();

        System.out.println(a.i);
    }
}