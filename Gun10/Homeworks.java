package Gun10;

import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        // 1- Girilen bir sayının birler basamağını ekrana yazdırınız.
//        2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
//        3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
//        4- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.
//        5- I love java olan bir String oluşturun. Bu cümlenin toplam karakter sayısını yazdırın.
//        6- Sprint planning olan bir String oluşturun. Bu dizenin _toplam karakter sayısını_ yazdırın.
//        7- paper olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın.örn: apple > APPLE
//        8- OraNge olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın. örn: APPLE > apple
//        9- New Jersey** olan bir String oluşturun. String'i _büyük harfe_ çevirin ve yazdırın
//        10- apple olan bir String oluşturun.String'in _içinde_ app olup olmadığını doğrula.
//        11- orange kelimesinden oluşan bir String oluşturun. String'in Apple'a _eşit_ olup olmadığını doğrulayın.
//        12- apple  olan  bir String oluşturun.String'in apple'a _eşit_ olup olmadığını doğrulayın. _Büyük harf veya küçük harf önemli değildir._
//        13- Florida kelimesinden bir String oluşturun.Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.
//        14- Thank you olan bir String oluşturun.Thank you içindeki, sadece  'y' harfinin bulunduğu _konumu_ yazdırın.
//        15- Mouse değerinde bir String oluştur.Mouse String'inin 3. sırasındaki karakteri_ yazdırın.
//        16- str1 ve str2 isimli 2 tane String oluşturulmuştur. Eğer str1, str2'ye _eşit ise_ **"String 1 is equal to String 2"** yazdırınız.
//        Eğer str1, str2'ye _eşit değil ise_ **"String 1 is NOT equal to String 2"** yazdırınız.
//        17- "I love coding" olan bir String oluşturun. 'o' yerine 'A' yerleştirin.Sonucu yazdırınız.
//        18- "code start here" olan bir String oluşturun.İlk önce gelen **'a'** karakterinin **kaçıncı sırada** olduğunu yazdırın.
//        19- 2 int oluşturun. int 1 'in değeri 120, int 2'nin değeri 158 olmalı. int 1 'in int 2'den büyük olup olmadığını doğrulayın.
//        (Eğer int1, int2'den **büyükse** konsolda **true** sonucu vermeli.)Cevabı yazdırın.
//        20- 2 double oluşturun.İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.Double1'in double2'ye eşit olmadığını doğrulayın.
//        Eğer **eşit değilse** cevap **true** olmalı.Cevabı yazdırınız.

        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        int birler = sayi %10;
        System.out.println(birler);

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1 = oku.nextInt();
        int onlar = (sayi1/10) % 10;
        System.out.println(onlar);

        Scanner oku1 = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi2 = oku1.nextInt();
        int yuzler = (sayi2/100) % 10;
        System.out.println(yuzler);

        Scanner oku2 = new Scanner(System.in);
        System.out.print("Vize notunu giriniz ");
        int vizeNotu = oku2.nextInt();
        System.out.print("Final notunu giriniz ");
        int finalNotu = oku2.nextInt();
        double ort = vizeNotu*0.4 + finalNotu*0.6;
        System.out.println("ort = " + ort);

        String text="I love java";
        System.out.println(text.length());

        String text2="Sprint planning";
        System.out.println(text2.length());
        
        String text3="paper";
        System.out.println("text3.toUpperCase() = " + text3.toUpperCase());

        String text4="OraNge";
        System.out.println(text4.toLowerCase());

        String text5="New Jersey**";
        System.out.println(text5.toUpperCase());

        String text6="apple";
        System.out.println(text6.contains("app"));

        String text7="orange";
        System.out.println(text7.equals("Apple"));

        String text8="apple";
        System.out.println(text8.equalsIgnoreCase("apple"));

        String text9="Florida";
        System.out.println(text9.indexOf("o"));

        String text10="Thank you";
        System.out.println(text10.indexOf("y"));

        String text11="Mouse";
        System.out.println(text11.charAt(3));

        String text12="I love coding";
        System.out.println(text12.replace("o","A"));

        String text14="I love coding";
        System.out.println(text14.replace("o","A"));

        String text13="code start here";
        System.out.println(text13.indexOf('a'));

        int say1=120;
        int say2=158;

        if (say1>say2){
            System.out.println("true");
        }else
            System.out.println("false");

        double say3=14.23;
        double say4=19.52;

        if (say3!=say4){
            System.out.println("true");
        }else
            System.out.println("false");









    }
}
