package Gun54.Ornek1;

// listeyi al listeye göre yaz demek için implements
public class A6 implements IYazdirilabilir{

    @Override
    public void yaz() { //parametre ve isim implments edilenle aynı olucak
        System.out.println("yazdırma işlemi başladı");
    }
}
