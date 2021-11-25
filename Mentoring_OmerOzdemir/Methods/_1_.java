package Mentoring_OmerOzdemir.Methods;

public class _1_ {
    /*
    Bir public static void method oluşturunuz
    parametre oalrak int a

    bu methodda a kadar (örn:20) yani 20ye kadar olan çift sayıları yazdırın
    1-2-3-4-5
    daha sonra a nın değeri main method içerisinden verin

     */
    public static void main(String[] args) {

//        ciftTopla(21);
        cift(21);
    }
//    public static void ciftTopla(int a){
//        int ciftToplam=0;
//
//        for (int i=0; i<a; i++){
//            if (i%2==0)
//                ciftToplam+=i;
//        }
//        System.out.println("ciftToplam = " + ciftToplam);
//    }
    public static void cift(int a){
        int cift=0;

        for (int i=0; i<a; i+=2){
            System.out.print(i+" ");
        }
    }
}
