package Gun42._02_DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_StringToLocalDateAndTime {
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        // bilgisinin time veya tarih değişkenine çevrilmesi

        String strDate="01 25 2020"; // 25/01/2020

        // String değeri tarihe çevirmek için format belirledik.
        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM dd yyyy");
        // Stringin formatı bu formata uygun olmalı .parse ile çevirdik
        LocalDate tarih=LocalDate.parse(strDate, format);
        System.out.println("tarih = " + tarih);

        String strTime="12:49";
        LocalTime saat=LocalTime.parse(strTime);
        System.out.println("saat = " + saat);
    }
}
