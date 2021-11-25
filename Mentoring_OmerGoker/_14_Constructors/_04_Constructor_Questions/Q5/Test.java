package Mentoring_OmerGoker._14_Constructors._04_Constructor_Questions.Q5;

public class Test {
    int x,y;
    public Test(int x, int y){
        initialize(x,y);
    }
    private void initialize(int x, int y) {
        this.x=x*x;
        this.y=y*y;
    }
    public static void main(String[] args) {
        int x=9, y=5;
        Test obj=new Test(x,y);
        System.out.println(x+" "+y); // obj.x obj.y değil
    }
}
