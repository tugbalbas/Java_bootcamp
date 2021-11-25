package Gun38.StaticModifier.Ornek2;

public class Okul {
    public static void main(String[] args) {

        Student ogr1=new Student("Ayşe","Yılmaz");
        Student ogr2=new Student("Ali","Demir");
        Student ogr3=new Student("Fatma","Bayrak");
//        ...
//        ...
//        ... kaç tane student olduğu belli değil
        Student ogr=new Student("Furkan","Şimşek");

        System.out.println("Student.sayac = " + Student.sayac);

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        System.out.println("ogr = " + ogr);
    }

}

//Student.sayac = 4
//        ogr1 = Ogrenci{id='1'ad='Ayşe', soyadi='Yılmaz'}
//        ogr2 = Ogrenci{id='2'ad='Ali', soyadi='Demir'}
//        ogr3 = Ogrenci{id='3'ad='Fatma', soyadi='Bayrak'}
//        ogr = Ogrenci{id='4'ad='Furkan', soyadi='Şimşek'}

// Static nasıl kullanılır ?
// CLASS adı ile kullanılır.
// NE İÇİN KULLANILIR ?
//1- Nesne tanımlayıp kullanmak yerine, t
//   anımlamadan kullanmak istediğimiz değişken veya metdolar için
//2- Tekrarlayan Nesnelere ait verileri tek bir değişkende toplamak için
//3- Nesneler için veya Genel için SAYAÇ olarak
//4- 3.Madde ile bağlantılı şekilde ID olarak


// Static anahtarının 3 adet kullanım amacı vardır.
// 1- Metoda veya fielda direkt class üzerinden ulaşım.
// 2- Tekrarlanan ifadeler için hafızayı iyi kullanma.
// 3- Oluşturulan nesneler için sayaç görevi için de kullanılır.