package javaDemos.exceptionHandling;

public class ex2 {

    public static void main(String[] args) {

        try {
            int[] sayilar=new int[] {1,2,3};
            System.out.println("sayilar[5] = " + sayilar[5]);
        }catch (StringIndexOutOfBoundsException exception){ // hata ismi yanlış old için çalışmadı
            System.out.println("exception = " + exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("exception = " + exception);
        }
        catch (Exception exception){
            System.out.println("Loglandı: " + exception);
        }finally {
            System.out.println("Ben her türlü çalışırım");
        }

    }
}
