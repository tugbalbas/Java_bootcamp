package Pazar_Grup_Calismasi.Soru210321;

public class Soru {
      public static void main(String[] args) {
              /*  Employee isminde bir class oluşturun. Alacağı değerler isim, maaş, çalışma saati ve işe başladığı yıl olacak.
            1. eğer aldığı maaş 1000$ veya daha az ise vergi kesintisi olmayacak. Yoksa %3 vergi kesilecek.
            2.Normal çalışma saati 40 saattir. Ekstra çalıştığı her saat için saat başına 30$ bonus alacak.
            3.Eğer 10 yıldan daha az süredir çalışıyorsa maaş artışı %5, 10 yıldan fazla ve 20 yıldan az ise %10, 20 yıl ve üstü için %15 zam alacaktır.
            (yil<10), (yil>=10 && yil<20), (yil>=20)
            4.Çalışanın tüm bilgilerini: vergi, bonus, maaş artışı, toplam maaşı(maaş-vergi+bonus), maaşını zam ile birlikte yazdırın

         */
            Employee calisan1=Employee.calisanBilgi("tugba",2500,45,2015);
            Employee calisan2=Employee.calisanBilgi("Mehmet",2000,40,2010);
            Employee.bilgiYaz(calisan2);

      }
}

