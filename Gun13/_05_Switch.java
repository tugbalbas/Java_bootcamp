package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Gün no: ");
        int gunNo=oku.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default: // yukarıdakilerin dışındaysa
                System.out.println("hatalı değer");
        }
    }
}
