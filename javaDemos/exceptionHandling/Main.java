package javaDemos.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        // ya try çalışşır ya da catch çalışır. finally her türlü çalışır (genelde kapatma işlemleri burada yapılır )
        try {
            int[] sayilar=new int[] {1,2,3};
            System.out.println("sayilar[5] = " + sayilar[5]);
        }catch (Exception exception){
            System.out.println("Hata oluştu");
            System.out.println("exception = " + exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");
        }

    }
}
