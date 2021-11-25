package Gun44;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _08_CheckedThrowException {
    //kull. hava sıcaklığını isteyiniz
    //ayrı bir methodda bunun kontrolünü yaparak hava
    //sıcaklığı 10dan küçük iseIOException hatası oluşturunuz
    //mainden çağırarak hatayı kontrol ediniz

    public static void SicaklikKontrol(int sicaklik) throws IOException {
        // Eğer bir metod içerisinde Checked Throw var ise methoda adına hata işareti
        // eklenmeden derlenmesine izin verilmez.Hata çizgisinin üzerine gelindiğinde Add..
        // a tıklandığında otomatik ekleyecektir. Bu şekilde bu metodu çağıran yerlerin try catch e
        // alınması garantiye alınmış olur.

        if (sicaklik < 10){
            throw new IOException("Hava gerçekten soğuk dışarı çıkma"); // checked olması için bu hata türü seçildi
        }
        System.out.println("Dışarıda basketbol oynayabilirsin");
    }

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Hava sıcaklığı: ");
        int sicaklik = oku.nextInt();

        try {
            SicaklikKontrol(sicaklik);
        }
        catch (Exception ex){
            System.out.println("ex = " + ex.getMessage());
        }


    }
}
