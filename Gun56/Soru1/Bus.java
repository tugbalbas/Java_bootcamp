package Gun56.Soru1;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo diesel ile 1000 km gidebilirsiniz.";
    }

    @Override
    public String drive() {
        return "Şehiriçine girme, yavaş sür yolcuları rahatsız etme.";
    }
}
