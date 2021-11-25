package Gun41._01_CreatingAndFormating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sınıfı Sadece gun, ay,Yıl bilgisi tutar
        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("FULL Locale.GERMANY= " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // Sistemde kullanılabilir lokalleri aşağıdaki kod ile aldık, ilgili ülkeyi if e aldık
        Locale[] kullanilabilirLokaller= Locale.getAvailableLocales();

        for(Locale l: kullanilabilirLokaller )
        {
            if (l.getDisplayCountry().toLowerCase().contains("ice"))
                System.out.println("l.getDisplayCountry() = " + l.getDisplayCountry()+" "+l);
        }

        Locale localIzlanda= new Locale("is","IS");

        System.out.println("FULL Localizsayon : Izlanda= " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localIzlanda)));

        // Kendimizde herhangi bir tarihi bu şekilde tarih değişkenine atıyoruz
        LocalDate tarih1= LocalDate.of(2020, 3, 9);
        LocalDate tarih2= LocalDate.of(2020,  Month.MARCH, 29);

        // istediğim formatta yazdırma
        System.out.println("tarih1 = " + tarih);

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("tarih1 özel format= " + tarih1.format(ozelFormat));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("EEEE d.M.yy");
        System.out.println("tarih1 özel format2= " + tarih1.format(ozelFormat2));
    }
}

//tarih = 2021-03-29
//        tarih.getYear() = 2021
//        tarih.getMonth() = MARCH
//        tarih.getMonthValue() = 3
//        tarih.getDayOfMonth() = 29
//        tarih.getDayOfWeek() = MONDAY
//        tarih.getDayOfYear() = 88
//        ISO_DATE = 2021-03-29
//        SHORT = 29/03/2021
//        MEDIUM = 29 Mar 2021
//        LONG = 29 March 2021
//        FULL = Monday, 29 March 2021
//        FULL Locale.GERMANY= Montag, 29. März 2021
//        l.getDisplayCountry() = Iceland is_IS
//        FULL Localizsayon : Izlanda= mánudagur, 29. mars 2021
//        tarih1 = 2021-03-29
//        tarih1 özel format= 09.03.2020
//        tarih1 özel format2= Mon 9.3.20

//is: dil  IS :ülke
//
//        Uluslararası ülke ve diller
//        bu şekilde kodlanmış
//        en EN -> normal ing.
//        en UK
//        en US
//        tr TR
//        fr CD
//        en CD