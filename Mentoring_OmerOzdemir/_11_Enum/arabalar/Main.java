package Mentoring_OmerOzdemir._11_Enum.arabalar;

public class Main {
    public static void main(String[] args) {

        cars[] carss = cars.values();

        System.out.println("Tüm araba marka ve fiyatları");

        for (int i = 0; i < carss.length; i++) {
            System.out.println("arabanın markası: " + carss[i].name() + "\n Fiyat: " + carss[i].getFiyat());
        }
    }
}
