package Gun05;

public class _06_JavaString {
    public static void main(String[] args) {
        int sayi=5;
        String ad="tuğba";
        String soyad="albaş";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println(ad);
        System.out.println("ad");

        String fullName=ad+soyad;
        System.out.println(fullName);

        int yas=26;
        int kilo=54;
        String bilgi=ad+" "+soyad+" "+ yas +" "+kilo;
        System.out.println(bilgi);
        // Toplama işleminde eğer bir tane bile string değişken varsa hepsi string kabul edilir sadece işlemde
    }
}
