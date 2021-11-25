package Mentoring_OmerOzdemir._11_Enum.arabalar;

public enum cars {
     /*
    Enum class oluşturun ve

    bmw 50
    mercedes 80
    opel 20
    volkswagen 30
    oluşturun.
    gerekli methodları ve constructorları oluşturun.

    daha sonra main classta tüm arabaları ve fiyatları yazdırın.
     */

    BMW(50),
    MERCEDES(80),
    OPEL(20),
    VOLKSWAGEN(30);

    private final int fiyat; // parantez içinde fiyatları simgelemek içn bunu yazmak zorundayız


    cars(int i) {
        this.fiyat = i;
    }

    public int getFiyat() {
        return fiyat;
    }

}
