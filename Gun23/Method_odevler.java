package Gun23;

import java.util.Arrays;
import java.util.Scanner;

//public class Method_odevler {
//    public static boolean main(String[] args) {
//        System.out.println(randomNum(10));
//        String girilen ="Java yazın";
//        reverseWord(girilen);

//        String gir ="Ben Javayı seviyorum";
//        ortaKelime(gir);

//        String str="6678421312";
//        System.out.println(EvenOddNums(str));

//        int[] array={2,4,6};
//        int[] array2={1,2,3,4,5};
//
//        System.out.println(Arrays.toString(append(array,array2)));

//        String yeni="Javayı seviyorum.";
//        reverseString(yeni);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bir cümle giriniz: ");
//        String myStr = sc.nextLine();
//        System.out.println(ters(myStr));

//        Scanner oku=new Scanner(System.in);
//        System.out.println("Bir sayı girniz: ");
//        int sayi= oku.nextInt();
//        System.out.println(powerOfThree(sayi));
//

//        1- Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//        Random numarayı döndürünüz.
//
//        2- "OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//        Ortadaki kelimeyi return yapınız.
//        Örnek: Ben Java'yı seviyorum.
//        print : Java'yı
//        Örnek2:
//
//        Java'yı kolayca öğreniyorum.
//
//        print: kolayca
//
//
//        3-
//        reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ
//
//
//        4-adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java
//
//        5-
//        EvenOddNums isminde bir method oluşturun.
//        Bu yöntem String olan bir parametreyi kabul etsin.
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //5-
//    public static int EvenOddNums(String gelen){
//
//        String[] dizi=gelen.split("");
//
//        int toplam=0;
//        for (int i = 0; i < dizi.length; i++) {
//            if (Integer.parseInt(dizi[i])%2 == 0){
//                toplam+= Integer.parseInt(dizi[i]);
//            }else
//                toplam-=Integer.parseInt(dizi[i]);
//        }
//        return toplam;
//
//    }
//
//        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//        toplam sonucu yazdırın.
//
//        **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//        For example Örnek:
//        String =  "6678421312"
//        6+6-7+8+4+2-1-3-1+2
//        sonuç 16 olmalı
//
//        6- Girilen bir diziyi tersten yazdıran bir metod yazınız.
//
//        7- powerOfThree isminde bir method oluşturun.
//        Parametre olarak int
//        Return tipi boolean
//        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//        **Örnek 1:**
//        **Girdi:** 27
//        **Çıktı:** true
//        Açıklama: 3*3*3 =27
//        Sonuç= true


//
//        8- append adında bir method oluşturun.
//        Parametre olarak iki int array  oluşturun.
//        ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//        Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//        Bunu döndürmelidir:
//        {2, 4, 6, 1, 2, 3, 4, 5}.
//
//        9- **isUnique** adında bir method oluşturun.
//        Parametre olarak int array alır.
//        ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri
//        döndürür (benzerlik yoksa true, var ise false).
//        örneğin, list isminde bir array'imiz varsa,
//        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
//        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        // 1-
//    public static double randomNum(int max){
//        System.out.println(Math.random()*max);
//        return Math.random()*max;
//    }

        //2-
//    public static String ortaKelime(String kelime){
//       String[] kelimedizi=kelime.split(" ");
//        for (int i = 0; i < kelimedizi.length; i++) {
//            System.out.println((kelimedizi.length/2)+1);
//        }
//        return kelime;
//    }
        //3-
//    public static String reverseString(String kelime){
//        String[] kelimedizi=kelime.split("");
//        for (int i = kelimedizi.length-1; i >= 0; i--) {
//            System.out.print(kelimedizi[i]);
//        }
//        return kelime;
//    }

        //4-
//    public static String reverseWord(String kelime){
//        String[] kelimedizi=kelime.split(" ");
//        for (int i = kelimedizi.length-1; i >=0 ; i--) {
//            System.out.println("kelimedizi = " + kelimedizi[i]);
//        }
//        return kelime;
//    }

        //5-
//    public static int EvenOddNums(String gelen){
//
//        String[] dizi=gelen.split("");
//
//        int toplam=0;
//        for (int i = 0; i < dizi.length; i++) {
//            if (Integer.parseInt(dizi[i])%2 == 0){
//                toplam+= Integer.parseInt(dizi[i]);
//            }else
//                toplam-=Integer.parseInt(dizi[i]);
//        }
//        return toplam;
//
//    }

        //6-
//    public static String ters(String myStr) {
//
//        String[] dizi1 = myStr.split(" ");
//        int a = 0;
//        String[] ters = new String[dizi1.length];
//        for (int i = dizi1.length - 1; i >= 0; i--) {
//            ters[a] = dizi1[i];
//            a++;
//        }
//        return Arrays.toString(ters);
//    }
//}

        //7-
//    public static boolean powerOfThree(int sayi){
//        int sayac=1;
//        do{
//            Math.pow(3,sayac);
//            if (sayac == sayi){
//            }
//            sayac++;
//        }while (sayac<=sayi);
//        return true;
//    }

        //8-
//    public static int[] append(int[] gelen1, int[] gelen2){
//
//        int[] yeniarray=new int[gelen1.length+ gelen2.length];
//        int sayac=0;
//
//        for (int i = 0; i < gelen1.length; i++) {
//            yeniarray[i]=gelen1[i];
//            sayac++;
//        }
//        for (int j = 0; j < gelen2.length; j++) {
//            yeniarray[sayac++]=gelen2[j];
//        }
//        return yeniarray;
//
//    }

        //9-
//    public static boolean isUnique(int[] dizi){
//        for (int i = 0; i < dizi.length-1; i++) {
//            for (int j = 0; j < dizi.length; j++) {
//
//                if (dizi[i] == dizi[j])
//                    return false;
//            }
//        }
//        return true;
//    }
//

