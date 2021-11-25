package _15_Non_AccessModifiers.Sorular;

public class StaticQ1 {


    int num1 = 3;
    static int num2 = 5;

    StaticQ1(int num1, int num2) {

        if (num2 < 30) {
            this.num2 = num2;   // num2=22
        }
      this.num1 = num1;
    }

    public static void main(String args[]) {

        StaticQ1 s1 = new StaticQ1(9, 10);    // s1.num1 = 3   s1.num2 =22
        System.out.println(s1.num2);
        StaticQ1 s2 = new StaticQ1(12, 22);    //  s1.num1 = 3  s2.num2 =22

        System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " "+ s2.num2);

    }
}

