package Gun37.DigerErisimler.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan isci=new Calisan();

        isci.id=1;
        isci.name="Gülcan";
        isci.surname="Demir";
        //isci.password="1234"; // bu yazılım açısından
        // burası private olduğundan direkt erişilemez.

        isci.sifreBelirle("1a4f_67dfgh");

//        System.out.println("isci.password = " + isci.password);
//
//        isci.password="1234"; private olduğundan aynı pakette de olsa erişilemiyor

        isci.sifreGoster();
    }
}
