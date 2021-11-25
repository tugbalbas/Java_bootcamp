package Gun37.DigerErisimler.DefaultErisim.iki;

import Gun37.DigerErisimler.DefaultErisim.bir.Kitap;

public class AmazonStore {
    public static void main(String[] args) {
        // başka paketteki default olduğundan erişim izni yok
//        Kitap eskiKitap=new Kitap();
//        eskiKitap.name="Yeni Java Kitabı";

// default old diğer paketten ulaşılamaz

        Kitap yeniKitap=new Kitap("Java Kitabı");
        // Bu constructora erişebildim çünkü public
    }
}
