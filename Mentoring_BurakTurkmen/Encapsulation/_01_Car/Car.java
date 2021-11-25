package Mentoring_BurakTurkmen.Encapsulation._01_Car;

public class Car {

    private String renk;
    private String model;
    private double motor;
    private int kapi;

    // private olunca değerlere ulaşabilmek için get-set
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        this.kapi = kapi;
    }
}
