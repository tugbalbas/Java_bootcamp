package Gun53.finalMethod;

public class Araba extends Tasit{
    public Araba(String model) {
        super(model);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//        toString()' cannot override 'toString()' in 'Gun53.finalMethod.Tasit'; overridden method is final
//    }

    /*
    yazdırma metodu toString final tipinde
    olduğundan override edilemez yani
    değiştirilemez
     */
}
