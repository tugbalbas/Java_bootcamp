package Gun41._01_CreatingAndFormating;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        // Başka ülke ve bölgelerin saat dilimine göre zamanı alma

        ZonedDateTime zdtLocal = ZonedDateTime.now(); // Lokal DateTime alır

        // Zoneları sistemden nasıl alabilrim
        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();
        for (String z : zamanBolgeleri) {

            if (z.toLowerCase().contains("honol"))
                System.out.println("z = " + z);

        }

        // İstenilen zonu aldım ve ZoneId oluşturdum
        ZoneId istenilenBolgeZonu = ZoneId.of("Pacific/Honolulu");
        ZonedDateTime zdt = ZonedDateTime.now( istenilenBolgeZonu );
        System.out.println("zdt = " + zdt);

        DateTimeFormatter gosterimSablonu = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdt = " + zdt.format(gosterimSablonu));


    }
}
//        z = Pacific/Honolulu
//        zdt = 2021-03-30T07:38:06.324382400-10:00[Pacific/Honolulu]
//        zdt = Salı 30.03.2021 07:38