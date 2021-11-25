package Gun49.Extends2;

public class Kus extends Hayvan{
    // Hayvan classındaki cons burda da oluşturmak zorundayız
    public Kus(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);  // super: superclassı işaret eder (hayvan metodu)
    }
    // Hayvan classındakini değil de özel olarak
    // bunu çalıştırmak istersek "override" ile ayırıyoruz
    @Override
    public void konustu(){
        System.out.println("kuş cik cik dedi");
    }
}
