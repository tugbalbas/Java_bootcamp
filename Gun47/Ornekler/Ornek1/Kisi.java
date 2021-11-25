package Gun47.Ornekler.Ornek1;

public class Kisi {
    //default
    String ad;
    String soyad;
    private int yas; // erişimini engelledik

    // değişkene direkt erişimi kapatıp
    // bir method ile korumalı setleme işlemine
    // Encapsulation denir
    // setter method

    // Yaş bilgisi için method oluşt.
    // Atamada oluşabilecek tüm hataları
    // Method içinde yok etmeye çalıştık
    // Atama old için 'set', bilgiyi almak için 'get'
    // Tüm bu işlemler 'Encapsulation'

    // setter method - korumak iç
    public void setYas(int yas) {

        this.yas = Math.abs(yas);

//   2. Yöntem
//        if (yas > 0)
//            this.yas = yas; // classtaki 'yas'a gelen int 'yas'ı at.
//        else
//            this.yas = -yas;
    }

    //getter method - bilgiyi almak için

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}

