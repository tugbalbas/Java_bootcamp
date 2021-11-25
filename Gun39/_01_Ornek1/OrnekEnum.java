package Gun39._01_Ornek1;

public class OrnekEnum {

    enum Aylar{
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
        TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK

        //Bunlar benim için sıralı simge olucak
    }


    public static void main(String[] args) {
//        Boolean lambaAcikMi=true;
//        lambaAcikMi=false;

        Aylar ay=Aylar.NISAN;
        switch (ay){
            case OCAK: System.out.println(31);
                break;

            case SUBAT: System.out.println(28);
                break;

            case MART: System.out.println(31);
                break;

            case NISAN: System.out.println(30);
                break;

            case MAYIS: System.out.println(31);
                break;

            case HAZIRAN: System.out.println(30);
                break;

            case TEMMUZ: System.out.println(31);
                break;

            case AGUSTOS: System.out.println(31);
                break;

            case EYLUL: System.out.println(30);
                break;

            case EKIM: System.out.println(31);
                break;

            case KASIM: System.out.println(30);
                break;

            case ARALIK: System.out.println(31);
                break;
        }
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("Bu ayın ENUM daki sırası = " + ay.ordinal()); // bu ayın enumdaki sırası

    }
}
//        30
//        ay = NISAN
//        ay.name() = NISAN
//        Bu ayın ENUM daki sırası = 3