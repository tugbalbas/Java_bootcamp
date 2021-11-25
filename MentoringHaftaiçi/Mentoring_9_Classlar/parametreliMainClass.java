package MentoringHaftaiçi.Mentoring_9_Classlar;

public class parametreliMainClass {

public static void topla(int a,int b){
    System.out.println(a+b);

}
public static void cikar(int a,int b){
    System.out.println(a-b);
}
public void carp(int a,int b){
    System.out.println(a*b);
}
public void bol(int a,int b){
    System.out.println(a/b);
}

    public static void main(String[] args) {
        topla(20,40);
        cikar(10,4);

        parametreliMainClass p=new parametreliMainClass();
        p.carp(3,6);
        p.bol(100,10);
    }
}
