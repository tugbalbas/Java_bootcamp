package Gun33._01_Ornek;

public class Utility {

    // Kendi sınıfımı yazdım
   public String getString(int value){
      return String.valueOf(value);
   }

   public int getInt(String value){
      return Integer.parseInt(value);
   }

   //Math.random() methoduna benzettik statik olduğu için
   //classtan bağımsız

   //static avantajı new yapmadan kullanılabiliyor.3. yöntem
   public static String getsString(int value){
      return String.valueOf(value);
   }

   public static int getsInt(String value){
      return Integer.parseInt(value);
   }

}
// her şeyi static yapıp, her yerde kullanmama mantığı
// hafızada boş yere çok fazla yer kaplaması