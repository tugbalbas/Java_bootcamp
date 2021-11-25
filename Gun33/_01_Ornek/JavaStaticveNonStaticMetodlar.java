package Gun33._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        // Benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım var.
        // mesala int to string , string to int, vs. vs.. bunları yapan bir sinif yazınız.
        // ve bunları main de kullanarak gösteriniz.

        //1.yöntem : Javanın kendi metodlarıyla yapılan çevirme işlemleri
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);

        //2. yöntem: kendi sınıfımı yazayım getString(), getInt(), getDouble()

        // new ile yeni oluşturmadan kullanamayız
        Utility util=new Utility();
        strRakam=util.getString(sayi);
        intRakam=util.getInt(strRakam);

        //3. yöntem
        // Math mat=new Math(); -> static old için new gerek kalmıyor
        Math.random();
        strRakam=Utility.getsString(sayi);
        intRakam=Utility.getsInt(strRakam);
        System.out.println("intRakam = " + intRakam);
        System.out.println("strRakam = " + strRakam);

    }
}
