package Gun44;

import java.util.Scanner;

public class _05_ThrowExample2 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        String username=oku.nextLine();

        try{
            if (username.length() < 6)
                throw new Exception("Kullanıcı adı 6 karakterden az olamaz"); // print kısmı silinip throw new yazılıyor
            // throw ile kendimiz hata oluşturuyoruz.
            // böylece kritelerimize girmeyenler için de
            // catch bloğunua düşürerek, pratik kullanım sağlıyoruz.
            // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
            // break gibi programın devamının çalışmasını engelliyoruz.
            // sürekli if-else oluşturup çalıştırmaya gerek kalmıyor

            if (username.length() > 10)
                throw new Exception("Kullanıcı adı 10 karakterden büyük olamaz"); // sout gibi
        }
        catch (Exception ex){
            System.out.println("Hata= " + ex.getMessage());
            // log tutuluyor
            // kimler bu hatalı girişleri yapmış
            // ...
            // birçok kontrol tek yerde toplanıyor.
        }


    }
}
