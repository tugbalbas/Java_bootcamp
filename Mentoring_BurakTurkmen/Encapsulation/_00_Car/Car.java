package Mentoring_BurakTurkmen.Encapsulation._00_Car;

public class Car {

    //Fields
//    public String renk;
//    public String model;
//    public double motor;
//    public int kapi;

    private String renk;
    private String model;
    private double motor;
    private int kapi;

    //üstteki private renk'i alttaki setRenk'e eşitlemek için this. kullanıyoruz.
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getRenk() {
        return renk;
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

