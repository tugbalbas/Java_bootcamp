package Gun47.Encapsulation_Odev_4;

import java.util.Scanner;

public class Odev4 {
    /*
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo
    Bütün variable'lar için getter ve setter oluşturunuz.

            4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)

-----------------------------------------------------------------

    Bir method oluşturun;

    Eğer room sayısı 0 ise,

    rent(kira) 1400

    Eğer oda sayısı 1 ise,

    rent  1700

    Eğer oda sayısı 2 ise,

    rent 2200

    Eğer oda sayısı 3 ise,

    rent 2700

    rent'i return'leyin.

----------------------------------------------------------------

    Bir method oluşturun.

    Eğer balconyOrNo  true ise,

    rent'e 200 dollar ekleyin.

    Main class'ın içinde;

            **userName rent is amountOfRent**





            import java.util.*;

     */


    static class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen isim giriniz: ");
            String name = scan.nextLine();
            System.out.println("Oda sayısını giriniz: ");
            int roomCount = scan.nextInt();
            System.out.println("Balkon istiyor musunuz: ");
            boolean balconyOrNo = scan.nextBoolean();
//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

            rentApartments apartment= new rentApartments(name,roomCount,balconyOrNo);
            System.out.println(apartment.getName()+" rent is "+apartment.balcony(apartment.isBalconyOrNo()));
        }
    }

    static class rentApartments {
        private String name;
        private int roomCount;
        private boolean balconyOrNo;

        public int rentPrice(int roomCount) {

            int rent=0;
            if (roomCount == 0) {
                rent = 1400;
            } else if (roomCount == 1) {
                rent = 1700;
            } else if (roomCount == 2) {
                rent = 2200;
            } else
                rent = 2700;
            return rent;

        }

        public int balcony (boolean balconyOrNo){
            int rent=rentPrice(roomCount);

             if (balconyOrNo){
                rent=rentPrice(roomCount)+200;
            }

            return rent;
        }


        public rentApartments(String name, int roomCount, boolean balconyOrNo) {
            setName(name);
            setRoomCount(roomCount);
            setBalconyOrNo(balconyOrNo);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoomCount() {
            return roomCount;
        }

        public void setRoomCount(int roomCount) {
            this.roomCount = roomCount;
        }

        public boolean isBalconyOrNo() {
            return balconyOrNo;
        }

        public void setBalconyOrNo(boolean balconyOrNo) {
            this.balconyOrNo = balconyOrNo;
        }
    }
}
