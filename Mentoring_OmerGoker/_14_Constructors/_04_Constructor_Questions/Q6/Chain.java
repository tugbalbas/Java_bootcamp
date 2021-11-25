package Mentoring_OmerGoker._14_Constructors._04_Constructor_Questions.Q6;

public class Chain {
    Chain()
    {
        this(5); //  bu bir method, tek parametreli constructora git diyor
        System.out.print(" the default constructor");
    }
    Chain(int x){
        this(5,10); //  bu da bir method, iki parametreli constructora git diyor
        System.out.print(x);
    }

    Chain(int x, int y){
        System.out.print(x*y);
    }
    public static void main(String[] args) {
        Chain x=new Chain();
    }
}
