package Gun42._02_DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        // bugün dünden sonra mı
        boolean sonraMi=bugun.isAfter(dun);
        System.out.println("bugün dünden sonra mı = " + sonraMi);

        // bugün dünden önce mi
        boolean onceMi=bugun.isBefore(dun);
        System.out.println("bugün dünden önce mi = " + onceMi);

        // bugün düne ESIT MI
        boolean esitMi=bugun.isEqual(dun);
        System.out.println("bugün düne eşit mi = " + esitMi);

        // bu tarih artık yıl mı
        boolean artikYilMi=bugun.isLeapYear();
        System.out.println("bu tarih artık yıl mı = " + artikYilMi);

        // 2 tarih arasında fark var ise farkın en büyük olduğu
        // değeri veriyor
        int fark = bugun.compareTo(dun.minusYears(2));
        System.out.println("fark = " + fark);

    }
}
