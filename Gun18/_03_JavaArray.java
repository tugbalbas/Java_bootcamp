package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // dizileri aşağıdaki şekillerde tanılayabiliriz.
        int[] dizi1=new int[5];
        int[] dizi2={5,77,4,786,0,-1,4,5,6,7,323,4,55,677};  // elamn sayısı kadar uzunlukta dizi tanımlandı
        // int sayi=5;

        String[] dizi3=new String[5]; // String tipinde 5 elemanlı içi boş dizi tanımlandı.
        boolean[] dizi4=new boolean[6]; // boolean tipinde 6 elelamnlı bir dizi tanımlandı.
        double[] dizi5=new double[5]; // double cinsinden 5 elemanlı dizi tanımlandı.

        for(int i=0; i<dizi1.length;i++)
            System.out.println("dizi1 (int) = " + dizi1[i]);

        for(int i=0; i<dizi2.length;i++)
            System.out.println("dizi2 (int) = " + dizi2[i]);

        for(int i=0; i<dizi3.length;i++)
            System.out.println("dizi3 (String) = " + dizi3[i]);

        for(int i=0; i<dizi4.length;i++)
            System.out.println("dizi4 (boolean) = " + dizi4[i]);

        for(int i=0; i<dizi5.length;i++)
            System.out.println("dizi5 (double) = " + dizi5[i]);
    }
}
