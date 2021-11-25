package Gun43._02_JavaException;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program başladı");

        try{ // dene, hatanın başladığı yerin üstüne konur

            System.out.println("Tarih setleniyor");
            LocalDate date= LocalDate.of(2018,Month.APRIL,40);//Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
            System.out.println("İşlem tamam");

        } // hata olduğu zaman programı kırma
        catch (Exception hata)// hata isimli değişkende oluşan hataların bilgisi atanıyor
        {
            System.out.println("Lütfen 0-31 arası gün giriniz");
            System.out.println("hata.getMessage(): "+hata.getMessage()); // hatanın mesajı
        }

        System.out.println("Programın bu bölümünde diğer metodlar çalışıyor");

        System.out.println("Program sonu");


    }
}
