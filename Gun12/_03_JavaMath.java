package Gun12;

public class _03_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nın mutlak değeri: " + Math.abs(a)); // 12
        System.out.println("a ve b den en büyük olanı: " + Math.max(a,b)); // 4
        System.out.println("2,6,8den en büyük olanı: " + Math.max(2,Math.max(6,8))); // 8
        System.out.println("a ve b den en küçük olanı: " + Math.min(a,b)); // -12
        System.out.println("b nin karekökü: " + Math.sqrt(b)); // 2
        System.out.println(" 2 nin 3. kuvveti = " + Math.pow(2,3) ); // 8
        System.out.println(" round of 3.1 = " + Math.round(3.1) ); // yuvarlama -> 3
        System.out.println(" round of 3.5 = " + Math.round(3.5)); // 4
        System.out.println(" ceil of 3.1 = " + Math.ceil(3.1) ); // üste yuvarlıyor -> 4
        System.out.println(" ceil of 3.5 = " + Math.ceil(3.5)); // 4
        System.out.println(" floor of 3.1 = " + Math.floor(3.1) ); // 3
        System.out.println(" floor of 3.5 = " + Math.floor(3.5) ); // 3
    }
}
