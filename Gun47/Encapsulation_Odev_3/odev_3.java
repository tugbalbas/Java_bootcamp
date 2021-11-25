package Gun47.Encapsulation_Odev_3;

import java.util.Scanner;

public class odev_3 {
    /*
    Burada iki class vardır. Biri Main diğeri ise Subscribe.

**Subscribe class'ının içinde;**

    Bu variables'ları **private** oluşturunuz.

    String name

    boolean doYouWanaSubscribe

    String whichMember

3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

**Main class'ın içinde;**

    Örnek;

    Name is Victoria, doYouWanaSubscribe true, whichMember Gold

    Eğer user(kullanıcı) **Gold** member(üye) olmak istiyorsa;

**Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon. yazdırınız.**

    Eğer user(kullanıcı) **Silver** member(üye) olmak istiyorsa;

**Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.**

    Eğer user(kullanıcı) **Bronze** member(üye) olmak istiyorsa;

**Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.**

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;

**See you when you want to be a member. Thanks yazdırınız.**
import java.util.*;
*/




    static class Main {
        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen isim giriniz: ");
            String name = scan.nextLine();

            Scanner scanbool= new Scanner(System.in);
            System.out.println("Abone olmak istiyor musunuz: ");
            boolean  doYouWanaSubscribe  = scanbool.nextBoolean();

            System.out.println("Üyelik seviyesini giriniz: ");
            String  whichMember = scan.nextLine();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

            Subscribe subscribe1=new Subscribe(name,doYouWanaSubscribe,whichMember);

//            boolean answer=true;
            if(doYouWanaSubscribe) {

                if (whichMember.contains("Gold"))
                    System.out.println("Welcome to membership" + subscribe1.getName() + ". Your membership is 40 dollar" +
                            " for month you can enjoy the videos , all homework and see you soon.");

                else if (whichMember.contains("Silver"))
                    System.out.println("Welcome to membership" + subscribe1.getName() + ". Your membership is 20  dollar" +
                            " for month you can enjoy the videos , all homework and see you soon.");

                else if (whichMember.contains("Bronze"))
                    System.out.println("Welcome to membership" + subscribe1.getName() + ". Your membership is 10  dollar" +
                            " for month you can enjoy the videos , all homework and see you soon.");


            }
            else
                System.out.println("See you when you want to be a member. Thanks yazdırınız.");





        }
    }

    static class Subscribe{

        private String name;
        private boolean doYouWanaSubscribe;
        private String whichMember;


        public Subscribe() {
        }

        public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
            setName(name);
            setDoYouWanaSubscribe(doYouWanaSubscribe);
            setWhichMember(whichMember);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isDoYouWanaSubscribe() {
            return doYouWanaSubscribe;
        }

        public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
            this.doYouWanaSubscribe = doYouWanaSubscribe;
        }

        public String getWhichMember() {
            return whichMember;
        }

        public void setWhichMember(String whichMember) {
            this.whichMember = whichMember;
        }

        @Override
        public String toString() {
            return "Subscribe{" +
                    "name='" + name + '\'' +
                    ", doYouWanaSubscribe=" + doYouWanaSubscribe +
                    ", whichMember='" + whichMember + '\'' +
                    '}';
        }
    }

}
