package Gun39._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Isleme Al
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // ISLEME AL (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        int secim=0;
        ArrayList<Pizza> siparisler=new ArrayList<>();

        do {
            Menu();
            System.out.print("Seçiminiz: ");
            secim= oku.nextInt();
//            islemYap(secim,siparisler);
            //işlemler


        }while (secim < 5);

    }

//    public static void islemYap(int secim, Arraylist<Pizza> siparisler){
//
//        switch (secim)
//    }

    public static void Menu(){
        System.out.println("***** PIZZA MENU *****");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- Isleme Al");
        System.out.println("5- Cikis");

    }


}
