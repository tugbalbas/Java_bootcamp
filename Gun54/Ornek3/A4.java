package Gun54.Ornek3;

public class A4 implements IYazdirilabilir,IGosterilebilir{
    @Override
    public void goster() {
        System.out.println("göster");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
    // 2 yapıyı da implemente ediyoruz



}
// Birden fazla interfaceten implemente edilebilir