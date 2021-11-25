package Gun37.DigerErisimler.DefaultErisim.bir;

public class Kitapci {
    // Aynı paketin içinde olduğundan
    // defaulta ulaşabildik
    public static void main(String[] args) {
        Kitap eskiKitap=new Kitap();
        eskiKitap.name="Yeni Java Kitabı";

        Kitap yeniKitap=new Kitap("Java Kitabı");

    }
}
