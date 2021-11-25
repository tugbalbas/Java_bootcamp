package Gun56.Soru1;

public class Tesla extends Vehicle implements IElectric{

    public Tesla(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "10 yılda bir bataryayı değiştir, Batarya Ömrü şu an: %80";
    }

    @Override
    public String drive() {
        return "Auto pilot sürebilirsin, keyif ile sürünüz.";
    }
}
