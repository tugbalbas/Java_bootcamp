package javaDemos.methods;

public class methods2 {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String yenimesaj = sehirVer();
        System.out.println("yenimesaj = " + yenimesaj);
        int sayi=topla(15,7);
        System.out.println("sayi = " + sayi);
        int toplam=topla2(2,3,4);
        System.out.println("toplam = " + toplam);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam=0;
        for (int sayi : sayilar){ // sayılardaki her bir sayı
            toplam+=sayi;
        }return toplam;
    }

    public  static String sehirVer(){
        return "Ankara";
    }
}
