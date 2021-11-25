package Gun49.Soru1;

public class Arac {
    private String renk;
    private int motor;
    private String model;

    public Arac(String renk, int motor, String model) {
        this.renk = renk;
        this.motor = motor;
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model='" + model + '\'' +
                '}';
    }
}
