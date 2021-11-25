package Gun06;

public class _08_Ornek5 {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazdırınız

        String bagis1="500";
        String bagis2="1500";

        int intBagis1=Integer.parseInt(bagis1);
        int intBagis2=Integer.parseInt(bagis2);

        int toplam = intBagis1 + intBagis2;
        // int toplam = Integer.parseInt(bagis1) + Integer.parseInt(bagis2);

        System.out.println("toplam = " + toplam);
    }
}
