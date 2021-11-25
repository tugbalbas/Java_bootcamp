package MentoringHaftaiçi.Mentoring_9_Classlar;

public class Car {
    // static olmayan methodlar

    public void tamGaz(){
        System.out.println("En hızlı araba");
    }
    public void maxSpeed(int speed){ // bu method,main method içerisinde çağırıldığında, kullanıcının bir int değer girmesi ZORUNLU!!
        System.out.println("Arabanın max hızı: "+speed);
    }

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.tamGaz();
        System.out.println("------");

        myCar.maxSpeed(500);


    }
}
