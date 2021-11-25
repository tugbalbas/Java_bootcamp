package javaDemos.classes;

public class classes {
    //Gruplama yapıyoruz
    public static void main(String[] args) {
        // reference type
        CustomerManager customerManager = new CustomerManager(); // Classın çağırımı yeni bie nesne üretiyoruz kullanmak için
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println("sayi2 = " + sayi2);

        // reference type (aynı classlar gibi referans tipte) referans numarası değişiyor
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1 [0] = 10;
        System.out.println("sayilar2[0] = " + sayilar2[0]);

    }
}
