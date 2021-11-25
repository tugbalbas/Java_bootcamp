package Gun56.Soru1;

import java.util.ArrayList;

public class OtoGaleri {
    public static void main(String[] args) {
        Tesla teslaCar=new Tesla("Model 5",310);
        ToyotaPrius prius=new ToyotaPrius("Prius",1200);
        Bus bus=new Bus("IVECO",7000);

        teslaCar.changeBattery();

        ArrayList<Vehicle> arabalar=new ArrayList<>(); // polymorphism sayesinde ekleniyor
        arabalar.add(teslaCar);
        arabalar.add(prius);
        arabalar.add(bus);

        for (Vehicle v : arabalar) {
            System.out.println("v = " + v);
            // bir döngü ile classname lerini ekrana yazdırınız.
            System.out.println("v.getClass().getSimpleName() = " + v.getClass().getSimpleName());
            
        }

    }
}
//        v = Vehicle{model='Model 5', engine=310.0}
//        v.getClass().getSimpleName() = Tesla
//        v = Vehicle{model='Prius', engine=1200.0}
//        v.getClass().getSimpleName() = ToyotaPrius
//        v = Vehicle{model='IVECO', engine=7000.0}
//        v.getClass().getSimpleName() = Bus