package Gun16;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
//        Bu String'i oluşturun. "Removes white space from both ends of a string"
//        String'deki kelime sayısını yazdırınız.

//        6-Bir String oluşturun : "Hello World"
//        Stringi tersten yazdırın ve print edin.
//        _Cevap böyle olmalı :  "dlroW olleH"_

//        7- İnt Array oluştur ve elemanları   : 25,30,30,35,100
//        Array in elemanlarının toplamını yazdır.
//        Cevap 220 olmalı.
//
//        8-int Array oluşturun.
//        elemanları : 13, 15,14,16,16
//        Arrayin elemanlarını yazdırın.
//
//        9-String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//        Array'daki eleman sayısını yazdırınız.
//        Cevap 4 olmalı.
//
//        10-String Array (Dizi) oluşturunuz.
//        elemanları : Apple, Orange , Babana, Kiwi
//        Array'leri tüm elemanları yazdırınız.
//
//        11-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//        Array'in ortalamasını alınız.
//
//        12-Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
//        ilk ve son elementlerini kapsayan yeni array'e return edin.
//        Oluşturacağınız int array'i =   ([1, 2, 3, 4])
//        Sonuç bu şekilde olmalıdır. [1, 4]
//
//        13-int Array oluşturun ve elemanları : 5,6,8,12,14,19
//        Eğer sayı çiftse topla, tekse çıkar.
//
//                **Örneğin:**
//
// **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//
//        Toplamlarını yazdırın.
//
//
//        14-int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
//
//        15-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//        En küçük (minimum) sayıyı yazdırınız.
//
//        16- int Array oluşturun ve elemanları : 12,2,5,15,8
//        En büyük değeri yazdırınız.
//
//        17- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//        Eğer aitse "true" çevirin.
//        Loops (döngüler) kullanın.
//
//        18-Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
//        $ işaretlerini kaldırın ve sayıları toplayın.
//        Sayıların toplamını yazdırın.

//        String str="Removes white space from both ends of a string";
//        int sayac=0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)==' ')
//                sayac++;
//        }
//        System.out.println("sayac = " + (sayac+1));

//        String str="Hello World";
//        String reverse="";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            reverse+=str.charAt(i);
//        }
//        System.out.println("reverse = " + reverse);

//        int[] dizi={25,30,30,35,100};
//        int toplam=0;
//        for (int i = 0; i < dizi.length; i++) {
//            toplam+=dizi[i];
//        }
//        System.out.println("toplam = " + toplam);

//        int[] dizi={13, 15,14,16,16};
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.println("i = " +i);
//        }

//        String[] dizi={"new jersey" , "new york", "boston","California"};
//        System.out.println(dizi.length);

//        String[] dizi={"Apple", "Orange" , "Banana", "Kiwi"};
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.println(dizi[i]);
//        }

//        int[] dizi={12, 14 , 21 ,23 , 10 ,4};
//        int toplam=0;
//        int ort=0;
//        for (int i = 0; i < dizi.length; i++) {
//            toplam+=dizi[i];
//            ort=toplam/dizi[i];
//        }
//        System.out.println(ort);

//        int[] dizi={1, 2, 3, 4};
//        int[] yeni={dizi[0],dizi[dizi.length-1]};
//        System.out.println(Arrays.toString(yeni));

//        int [] dizi = {5,6,8,12,14,19};
//        int toplam=0;
//
//        for (int i=0; i<dizi.length; i++){
//
//            if (dizi[i] %2 == 0){
//                toplam+=dizi[i];
//            }
//            else
//                toplam-=dizi[i];
//        }
//        System.out.println(toplam);
//    }
//}
//        int[] dizi={15 , 25, 22, 18, 30};
//        int max=dizi[0];
//        int max2=dizi[0];
//        int maxx=dizi[0];
//
//        Arrays.sort(dizi);
//        System.out.println(dizi[dizi.length-2]);
//
//        for (int i = 0; i <dizi.length ; i++) {
//            if (max <dizi[i]){
//                max=dizi[i];
//                if (max2 <max){
//                    max2=maxx;
//                }
//            }
//            System.out.println("maxx = " + maxx);
//        }

//        int[] dizi={15 , 25, 22, 18, 30};
//        int enKucuk=dizi[0];
//
//        for (int sayi: dizi) {
//            if (enKucuk > sayi)
//                enKucuk=sayi;
//        }
//        System.out.println("enKucuk = " + enKucuk);

//        int[] dizi={12,2,5,15,8};
//        int enBuyuk=dizi[0];
//
//        for (int sayi: dizi) {
//            if (enBuyuk < sayi)
//                enBuyuk=sayi;
//        }
//        System.out.println("enBuyuk = " + enBuyuk);

//        String [] dizi={"Apple" , "Orange" , "Banana" , "Pineapple"};
//
//        for (int i = 0; i < dizi.length; i++) {
//            if (dizi[i].contains("Apple")) {
//                System.out.println("true");
//            }
//        }

//        String text="$12 $23 $10 $2 $5 $2";
//        String yeniText=text.replaceAll("[$]","");
//        String[] array=yeniText.split(" ");
//
//        int toplam=0;
//        for (int i = 0; i < array.length; i++) {
//            toplam+=Integer.parseInt(array[i]);
//        }
//        System.out.println("toplam = " + toplam);




    }
}
