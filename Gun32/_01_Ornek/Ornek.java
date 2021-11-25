package Gun32._01_Ornek;

public class Ornek {
    // 1.Adım  :Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2.Adım  :main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren
    //          metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {
        Person kisi1 = new Person();
        kisi1.name = "Tuğba";
        kisi1.surname ="Albaş";
        kisi1.age = 26;

        //1.yöntem oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);


        Person kisi2 = new Person();
        kisi2.name = "Ayşe";
        kisi2.surname ="Demir";
        kisi2.age = 30;

        //1.yöntem oldukça uğraştırıcı (mainde yazdırmak)
        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);
        // Bunları böyle tek tek print etmek yerine aşağıdaki gibi yazdırabiliyoruz.

        //2. Yöntemin kullanılması: : kendi başına yazdır fakat her nesne için böyle yazarsak oldukça karışır.(metod kullan)
        BilgiYazdir(kisi1); // bu yöntemde parametre göndermek zorunda kalıyorum,
        BilgiYazdir(kisi2);

        System.out.println();

        //3. yöntemin mainde kullanılması : parametre bile göndermedi -> en pratik
        kisi1.BilgiYazdir(); // bu yöntemde parametre zaten kendisinin içinde, büyük kolaylık (hem özellikler hem davranışlar)
        kisi2.BilgiYazdir();

        kisi1.getBirthYear();
        kisi2.getBirthYear();

        kisi1.getInitials();
        kisi2.getInitials();


        System.out.println("kisi1.getInitials() = " + kisi1.getInitials());
        System.out.println("kisi2.getInitials() = " + kisi2.getInitials());

    }



    //2. yÖntem
    public static void BilgiYazdir(Person kisi){

        System.out.println("kisi = " + kisi.name);
        System.out.println("kisi = " + kisi.surname);
        System.out.println("kisi = " + kisi.age);
    }

}



// 1. KISIM
class Person {
    String name;
    String surname;
    int age;

    // methods
    // class içinde olunca 'public, static' yazmak zorunda değiliz.
    public void BilgiYazdir() {
        //3.yöntem ait old classa ekleniyor ve en iyi yöntemi bulmuş oluyoruz.

        System.out.print("kisi.name = " + name); //kisi.name yazmak zorunda değiliz, classtaki değişkenleri direkt kendisi alır.
        System.out.print(" kisi.surname = " + surname);
        System.out.println(" kisi.age = " + age);
    }

    public void getBirthYear(){
        System.out.println("Doğum yılı: " + (2021-age));
    }

    // 4. Adım: getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren metodu yazınız.
    // (Tuğba albaş: T.A.)
    String getInitials(){
        return name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".";
    }

}

