package Gun39._02_Ornek;

public class Ornek {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.

    public static void main(String[] args) {
        User mudur=new User("Ragip",Role.ADMIN,Statu.AKTIF);
        User satis=new User("Hamza",Role.SATIS,Statu.AKTIF);
        User kullanici=new User("Necdet",Role.PERSONEL,Statu.PASIF);

        UserSil(mudur);
        UserSil(satis);
        UserSil(kullanici);

        // bu hatalı oluyor burda enuma ihtiyaç duyuyoruz
//        User mudur=new User("Ragip",2,2);
//        User satis=new User("Hamza",2,1);
//        User kullanici=new User("Necdet",1,1);
//
//        if (kullanici.role == 1){
//            System.out.println("mudur silme");
//        }
    }

    public static void UserSil(User kullanici){
        if (kullanici.role==Role.ADMIN){
            System.out.println("Silme işlemi yapıldı");
        }
    }

}
