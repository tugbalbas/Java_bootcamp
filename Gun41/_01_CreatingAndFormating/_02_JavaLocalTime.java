package Gun41._01_CreatingAndFormating;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) {
        // Tarih içermez sadece saat,dak, san, nano san içerir.

        LocalTime saat=LocalTime.now(); // o andaki saati aldı

        System.out.println("saat = " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        DateTimeFormatter ozelFormat=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat.format(ozelFormat) = " + saat.format(ozelFormat));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("saat.format(ozelFormat2) = " + saat.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("kk:mm:ss");
        System.out.println("saat.format(ozelFormat3) = " + saat.format(ozelFormat3));

        LocalTime saat2=LocalTime.of(21,12);
        LocalTime saat3=LocalTime.of(21,34, 12);


    }
}
