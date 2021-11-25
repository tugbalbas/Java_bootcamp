package Gun54.Ornek4;

public class Test implements IGoster, IYazdir{


    @Override
    public void goster() {
        System.out.println("göster");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println(mesaj+" yaz");
    }

    @Override
    public void yaz() {
        System.out.println("yaz");
    }
}
// implemente edilen interfaceler de aynı isim ve parametrede
// olan methodlardan bir tane yazmank yeterlidir
// problem oluşturmaz