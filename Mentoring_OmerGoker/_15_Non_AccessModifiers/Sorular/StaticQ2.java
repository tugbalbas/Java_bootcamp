package _15_Non_AccessModifiers.Sorular;

public class StaticQ2 {

    static String n1= examName("A");

    {
        n1=examName("B");
    }

    static{
        n1=examName("C");
    }

    public static void main(String[] args) {
        System.out.println("D");
        StaticQ2 sd = new StaticQ2();

    }

    public static String examName(String s){
        System.out.println(s);
        return s;
    }
}

