package Gun56.Soru1;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return " Ömür boyu değiştirmeden sür";
    }

    @Override
    public String changeOil() {
        return "30 litre benzin ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "İlk 10 km elektrik kullanır";
    }
}
