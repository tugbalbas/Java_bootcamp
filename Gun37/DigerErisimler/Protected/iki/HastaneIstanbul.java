package Gun37.DigerErisimler.Protected.iki;

import Gun37.DigerErisimler.Protected.bir.Doktor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        // Burası diğer paket 2
        //protected olduğunda default gibi
        //diğer paketlerden kullanılamıyor.

//    Doktor dr=new Doktor();
//    dr.ad="Tugba";

        Doktor dr2=new Doktor("Furkan");
    }
}
