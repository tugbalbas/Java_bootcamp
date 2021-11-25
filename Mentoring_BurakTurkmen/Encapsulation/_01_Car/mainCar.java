package Mentoring_BurakTurkmen.Encapsulation._01_Car;

public class mainCar {
    public static void main(String[] args) {

        Car car1 = new Car();

//        car1.renk="Gümüş";
//        car1.model="Renault Megane";
//        car1.motor=1.6;
//        car1.kapi=4;

        car1.setRenk("Gümüş");
        car1.setModel("Renault Megane");
        car1.setMotor(1.6);
        car1.setKapi(4);

        System.out.println("Arabanın rengi: "+car1.getRenk());
        System.out.println("Arabanın modeli: "+car1.getModel());
        System.out.println("Arabanın motor hacmi: "+car1.getMotor());
        System.out.println("Arabanın kapı sayısı: "+ car1.getKapi());



    }
}
