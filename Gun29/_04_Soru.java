package Gun29;

import java.util.*;
// Kullanıcıya
// 1-Ekleme
// 2-Listeleme
// 3-Arama
// 4-Düzeltme
// 5-Çıkış
// Seçeneklerini vererek username,password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
// Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
// Mainde sadece Seçenekler ve metodların çağrılması olsun.
// Bölüm bölüm gidiyoruz önce mainin içini tasarlayınız.

public class _04_Soru {
    public static void main(String[] args) {
        Map<String, Map<String, String>> kullanıcılar = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int secim = 0;
        menuYaz();
        while (secim < 5) {
            System.out.println("İşlem seçiniz");
            secim = scanner.nextInt();
            islemYap(secim, kullanıcılar);
        }
    }
    public static void menuYaz() {
        System.out.println("**** Menü ****");
        System.out.println("1-Ekleme");
        System.out.println("2-Listeleme");
        System.out.println("3-Arama"); // Kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
        System.out.println("4-Düzeltme"); // Kullanıcıdan bir username alıp bunun bilgilerinin değiştirilmesi sağlanacak
        System.out.println("5-Çıkış");
    }
    public static void islemYap(int secim, Map<String, Map<String, String>> kullanıcılar){
            switch (secim){
                case 1 : ekleme(kullanıcılar); break;
                case 2 : listeleme(kullanıcılar); break;
                case 3 : arama(kullanıcılar); break;
                case 4 : duzeltme (kullanıcılar); break;
            }
    }

    public static void ekleme(Map<String, Map<String, String>> kullanıcılar){
        Map<String, String> kullanıcı=new LinkedHashMap<>();
        Scanner oku=new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        String isim=oku.nextLine();
        System.out.println("Şifre giriniz: ");
        String sifre=oku.nextLine();
        System.out.println("Kullanıcı tipi girin: ");
        String userType=oku.next();

        kullanıcı.put("şifre", sifre);
        kullanıcı.put("userTipi", userType);

        kullanıcılar.put(isim,kullanıcı);
    }

    public static void listeleme(Map<String, Map<String, String>> kullanıcılar){
        for ( Map.Entry<String,Map<String,String>> kullanıcı: kullanıcılar.entrySet()) {
            System.out.println(kullanıcı.getKey()+" "+kullanıcı.getValue());
            //System.out.println(kullanıcı.getValue());
        }
    }

    // Kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
    public static void arama(Map<String, Map<String, String>> kullanıcılar){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir isim girin: ");
        String isim=scanner.nextLine();
        System.out.println(kullanıcılar.get(isim));
}

    // Kullanıcıdan bir username alıp bunun bilgilerinin değiştirilmesi sağlanacak
   public static void duzeltme(Map<String, Map<String, String>> kullanıcılar) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Kullanıcı adı girin: ");
       String isim=scanner.nextLine();
       kullanıcılar.remove(isim);
       ekleme(kullanıcılar);
}
}
