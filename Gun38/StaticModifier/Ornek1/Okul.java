package Gun38.StaticModifier.Ornek1;

public class Okul {
    public static void main(String[] args) {
        // okuladını siliyoruz
        Ogrenci ogr1=new Ogrenci("Ali", "Yılmaz");
        Ogrenci ogr2=new Ogrenci("Ayşe", "Demir");
//        ...
//        ...
//        ...
        Ogrenci ogr500=new Ogrenci("Hilal","Bayrak");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr500 = " + ogr500);



    }
}
//   ogr1 = Ogrenci{ad='Ali', soyad='Yılmaz', okulAd='Yıldırım Lisesi'}
//   ogr2 = Ogrenci{ad='Ayşe', soyad='Demir', okulAd='Yıldırım Lisesi'}
//   ogr500 = Ogrenci{ad='Hilal', soyad='Bayrak', okulAd='Yıldırım Lisesi'}
