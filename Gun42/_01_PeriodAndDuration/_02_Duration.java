package Gun42._01_PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    // time ve DateTime arasındaki farkı bulur
    public static void main(String[] args) {
        // time farkı
        LocalTime geceYarisi = LocalTime.of(0,0);
        LocalTime ogleVakti =LocalTime.of(13,3,2,0);

        Duration fark = Duration.between(geceYarisi,ogleVakti);
        System.out.println("fark = " + fark);

        System.out.println("fark.toHours() = " + fark.toHours()); // farkın Toplam Saat hali
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // farkın toplam dakika hali (dakikaya çevrilmiş hali)
        System.out.println("fark.toSeconds() = " + fark.toSeconds()); // toplam saniye hali
        System.out.println("*********");
        System.out.println("fark.toHoursPart() = " + fark.toHoursPart()); // farkın sadece tam saat parçasını verir
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart()); // farkın dakika parçasını verir
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart()); // farkın saniye parçasını verir

        System.out.println("*** 2 Zaman Farkı DateTime ***");
        LocalDateTime from = LocalDateTime.of(2020,10,4,
                10,20,55);
        LocalDateTime to=LocalDateTime.of(2020,10,10,
        10,21,1);
        
        Duration farkZaman = Duration.between(from, to);
        System.out.println("farkZaman = " + farkZaman);

        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());

    }
}
