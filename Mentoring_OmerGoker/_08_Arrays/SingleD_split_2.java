package Mentoring_OmerGoker._08_Arrays;

public class SingleD_split_2 {
    public static void main(String[] args) {

        // Bir Scanner oluşturup bir tarih giriniz. Örn: (19/08/2020)
        // Bu tarihteki / işsaretlerine split methodu uygulayınız.

        String tarih="02/09/1994";

        System.out.println("Doğum günü: ");

        String[] array=tarih.split("/");

        for (String date : array) {
            System.out.println(date);
        }

    }
}
