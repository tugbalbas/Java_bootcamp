package Gun44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_TryCatchFinally {
    public static void main(String[] args) {

        long startTime= 0;
        try{
            startTime= System.currentTimeMillis(); // işlem süresi
            String str="Bugün";
            System.out.println("Hatadan önceki nokta");
            char ilkHarf=str.charAt(9);
            System.out.println("Hatadan sonraki nokta");
        }
        catch (Exception hata)
        {
            System.out.println("Catch bölümü çalıştı");
        }
        finally {
            System.out.println(System.currentTimeMillis()-startTime);
            // hata olsun veya olmasın çalışacak final bölümü: her zaman çalışır
            // yapılarak kod düzeni sağlanmış olur. burası her zaman çalışıyor sonuç olarak, kapatma işlemi gibi
            // Kod düzeni için kullanılıyor
            System.out.println("Finally bölümü çalıştı");
            // kullanım sebebi: try catch in içinde yapılmış
            // işlemlerde arta kalan kapama gibi bu bölüme ait işlemler
            // yapılarak kod düzeni sağlanmış olur.
        }

        System.out.println("try-catch bloğundan sonra çalışan kısımlar.");
    }
}
