package Gun19;

import java.util.Arrays;

public class _03_JavaArrayMetodlar {
    public static void main(String[] args) {
// Arrays.toString(dizi); -> diziyi direkt yazdırır
        String[] isimler={"ahmet","semih","sevim","serkan","mesut"};
        System.out.println(" .toString(): " + Arrays.toString(isimler));

        // Arrays.sort(dizi); -> diziyi sıralıyor
        Arrays.sort(isimler);
        System.out.println(".sort = " + Arrays.toString(isimler));

        // Arrays.equals(dizi1,dizi2); Bütün elemanların sırası ile
        // birbirine eşit mi diye kontrol eder.
        int[] a={1,2,3};
        int[] b={1,2,3};
        int[] c={2,1,3};

        System.out.println("a==b " + Arrays.equals(a,b)); // true
        System.out.println("a==c " + Arrays.equals(a,c)); // false

        // Arrays.fill(dizi, deger); bütün elemanları deger ile doldurur
        int[] numbers=new int[5];
        System.out.println("atamadan  önce = " +  Arrays.toString(numbers));
        Arrays.fill(numbers, 7);
        System.out.println("atamadan sonra = " +  Arrays.toString(numbers));

        // Arrays.BinarySearch(dizi, deger);
        // deger i sıralanmış olan dizi içinde arar bulabilirse indexi
        // döndürür bulamazsa - bir değer döndürür.
        int[] rakamlar={2,7,4,6,23,5,6};
        System.out.println("önce : 8 in indexi  = " + Arrays.binarySearch(rakamlar, 8));
        System.out.println("önce : 23 in indexi  = " + Arrays.binarySearch(rakamlar, 23));
        Arrays.sort(rakamlar);
        System.out.println("sıralama sonrası = " +  Arrays.toString(rakamlar));
        System.out.println("önce : 8 in indexi  = " + Arrays.binarySearch(rakamlar, 8));
        System.out.println("önce : 23 in indexi  = " + Arrays.binarySearch(rakamlar, 23));

    }
}
