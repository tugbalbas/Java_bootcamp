package _15_Non_AccessModifiers.Sorular;

public class InitializationBlock {

    int a=yukle(1);
    static int b=yukle(2);

    {
        System.out.println("Instance Initialization block");
    }

    static {

        System.out.println("Static Initialization block");

    }

    public static int yukle(int s){
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Main basladi");
        InitializationBlock nesne1=new InitializationBlock();
        InitializationBlock nesne2=new InitializationBlock();

    }
}

