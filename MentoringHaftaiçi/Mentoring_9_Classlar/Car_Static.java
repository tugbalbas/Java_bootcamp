package MentoringHaftaiçi.Mentoring_9_Classlar;

public class Car_Static {
    public static void tamGaz(){
        System.out.println("En hızlı araba");
    }

    public static void maxSpeed(int speed){ // bu method,main method içerisinde çağırıldığında, kullanıcının bir int değer girmesi ZORUNLU!!
        System.out.println("Arabanın max hızı: "+speed);
    }

    public static void main(String[] args) {
        tamGaz();
        maxSpeed(500);
    }
}
