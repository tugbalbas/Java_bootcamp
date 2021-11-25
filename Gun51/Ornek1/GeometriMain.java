package Gun51.Ornek1;

public class GeometriMain {
    public static void main(String[] args) {
        Cember cember = new Cember(3);
        System.out.println("cember.getCevre() = " +
                cember.getCevre());

//        System.out.println("cember.getAlan() = " + cember.getAlan());
//        cember.getAlan() = 0.0 exception ekle
        
        Dikdortgen d = new Dikdortgen(5,4);
        System.out.println("d.getAlan() = " + d.getAlan());
        System.out.println("d.getCevre() = " + d.getCevre());
        
    }
}
