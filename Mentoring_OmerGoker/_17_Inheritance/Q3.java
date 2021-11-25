package _17_Inheritance;

public class Q3 {
}
class K
{
    {
        System.out.println(1);
    }
}

class L extends K
{
    {
        System.out.println(2);
    }
}

class M extends L
{
    {
        System.out.println(3);
    }
}

class MainClass2
{
    public static void main(String[] args)
    {
        M m = new M();
    }
}