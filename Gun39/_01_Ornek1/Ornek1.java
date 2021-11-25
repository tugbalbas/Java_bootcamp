package Gun39._01_Ornek1;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ayNo ya göre, ayın kaç gün sürdüğünü
        // bulan programı yazınız

        int ayNo=7;

        switch (ayNo){
            case 1:System.out.println(31);break;
            case 2:System.out.println(28);break;
            case 3:System.out.println(31);break;
            case 4:System.out.println(30);break;
            case 5:System.out.println(31);break;
            case 6:System.out.println(30);break; // haziran
            case 7:System.out.println(31);break;
            case 8:System.out.println(31);break;
            case 9:System.out.println(30);break;
            case 10:System.out.println(31);break;
            case 11:System.out.println(30);break;
            case 12:System.out.println(31);break;
            default:System.out.println("Hatalı Ay No");
        }

        switch (ayNo)
        {
            case 1:System.out.println("Ocak");break;
            case 2:System.out.println("Şubat");break;
            case 3:System.out.println("Mart");break;
            case 4:System.out.println("Nisan");break;
            case 5:System.out.println("Mayıs");break;
            case 70:System.out.println("Haziran");break;
            case 71:System.out.println("Temmuz");break;
            case 8:System.out.println("Ağustos");break;
            case 9:System.out.println("Eylül");break;
            case 10:System.out.println("Ekim");break;
            case 11:System.out.println("Kasım");break;
            case 12:System.out.println("Aralık");break;
            default:System.out.println("Hatalı Ay No");
        }


        String ayAd="Ocak";
        switch (ayAd)
        {
            case "ocak":System.out.println("Ocak");break;
            case "şuBat":System.out.println("Şubat");break;

            default:System.out.println("Hatalı Ay No");
        }

        if (ayNo==5){
            System.out.println("Yedek aldı");
        }


        // Pizza için sipariş programı yazılıyor.
        // Pizzanın 3 aşaması var web den sipariş verene gösteriliyor
        // Piiza hazırlanıyor, Pizza Pişiriliyor, Pizza gönderildi.


        String pizzaSonDurum="";
        if (pizzaSonDurum == "Pizza Hazırlanıyor")
        {
            System.out.println("Webde hazırlanıyor göster");
        }

    }
}
