package Gun23;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {

        ortalamaBulYaz("Ali", 60, 80, 85, 95, 100, 60);
        ortalamaBulYaz("Mehmet", 60, 75, 55, 90);
        ortalamaBulYaz("Ayşe", 65, 70, 75);
        ortalamaBulYaz("Ömer", 60, 80, 85, 95, 60);

        ortalamaBulYaz(44, 60, 80, 85, 95, 60);

    }

    // ... ile ilgili 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı
  public static void ortalamaBulYaz(String ad, int...notlar){
        int toplam=0;

      for (int not: notlar) {
          toplam+=not;
      }
      System.out.println(ad+" = " + toplam/ notlar.length);
  }

  public static void ortalamaBulYaz(int yas, int... notlar){

  }

}
