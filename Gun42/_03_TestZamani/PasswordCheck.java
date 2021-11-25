package Gun42._03_TestZamani;

public class PasswordCheck {
    public static void main(String[] args) {

    }
    // Metod : aldığı bir sifrenin 8 karakterden az olmamasını ve
    // içinde en az bir rakam ve harf olup olmadığını kontrol eden metod olsun
    // gecerli ise TRUE, değilse False dönsün
    public static boolean passCheck(String gelenSifre){
        if (gelenSifre.length()<=8)
            return false;
        else
            return true;
    }
}
