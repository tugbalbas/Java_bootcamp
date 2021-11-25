package Gun49.Extends2;

public class Kopek extends Hayvan{
    // Hayvan classındaki cons burada da oluşturmak zorundayız
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);  // super: superclassı işaret eder (hayvan metodu)
    }
    // Hayvan classındakini değil de özel olarak
    // bunu çalıştırmak istersek "override" ile ayırıyoruz
    @Override
    public void konustu(){
        System.out.println("köpek havhav dedi");
    }

}
