package Gun17;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // 1 den 5(dahil) e kadar olan sayıların toplamını aşağ yazdırınız. toplama tablosu

        // 1 + 1 = 2
        // 1 + 2 = 3
        // 1 + 3 = 4
        // 1 + 4 = 5
        // 1 + 5 = 6

        // 2 + 1 = 3
        // 2 + 2 = 4
        // ...

        for (int i=1; i<=5; i++){

            for (int j=1; j<=5; j++)
                System.out.println(i+" + "+j+" = "+ (i+j));

            System.out.println();
        }

    }
}
