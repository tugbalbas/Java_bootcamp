package Gun18;

public class _02_JavaArray {
    public static void main(String[] args) {

        int sayi; // daha önce 1 değişkeni bu şekilde tanımlıyorduk
        int[] dizi1=new int[5]; // 0,1,2,3,4  indexli 5 adet sayılık yer açtık,

        System.out.println("dizi1.length = " + dizi1.length);

        for (int i = 0; i < dizi1.length; i++) {
            System.out.println("Dizi nin "+i+".Elemanı = " + dizi1[i]);
        }
        System.out.println("dizi1[4] = " + dizi1[4]); // 1 tane eleman için örneğin 4.elamanı bu şekilde
        // yazdırabiliriz.4. indexe göre aslında adet açısından 5.Elamandır.
    }
}
