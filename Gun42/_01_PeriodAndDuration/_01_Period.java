package Gun42._01_PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasındaki geçen zamanı yıl ay gün olarak verir
        // DateTime lar için kullanılır, kendisi aynı zamanda belli bir zamanda belli bir zaman
        // aralığını da tutabilir

        LocalDate dtDogumGunu = LocalDate.of(1994,9,2);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dtDogumGunu,bugun);

        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark.getYears() +\" Yıl, \"+ = " + fark.getYears() + " Yıl, " +
                fark.getMonths()+" ay, "+fark.getDays()+" gün");

        //*****

        Period period3Gun=Period.ofDays(3); // 3 günlük süreyi temsil ediyor
        Period ceyrekYil=Period.ofMonths(3); // 3 aylık süre tutuyor

        LocalDate ucGunSonra = bugun.plus(period3Gun); // bugüne 3 gün eklendi
        LocalDate ucAySonra = bugun.plus(ceyrekYil); // bugüne 3 ay eklendi.
        LocalDate bugünTekrar = ucAySonra.minus(ceyrekYil); // tekrar 3 ay çıkarıldı

        // Örnek kursun süreleri
        LocalDate kursunBaslangic = LocalDate.of(2021,2,1);
        Period kursSure = Period.ofMonths(8);
        LocalDate kursBitis = kursunBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
        


    }
}
