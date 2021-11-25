package Gun38.finalModifier.Ornek2;

public class Ornek {
    // Person isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.
    public static void main(String[] args) {
        Person kisi1= new Person("İrfan");
        Person kisi2= new Person("Emir");

        System.out.println("kisi1 = " + kisi1); // kisi1 = Person{isim='İrfan', tcNo=10001}
        System.out.println("kisi2 = " + kisi2); // kisi2 = Person{isim='Emir', tcNo=10002}

        // kisi1.tcNo=10005; final olduğu için yeni değer atayamıyorum

    }
}
