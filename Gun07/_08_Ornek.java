package Gun07;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan kaç bilet istediğini(byte) ve sigorta isteyip istemediğini (boolean olarak) alıp ekrana yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç bilet istiyorsunuz:");
        byte biletSayisi = input.nextByte();

        System.out.print("sigorta istiyor musunuz:");
        boolean sigorta=input.nextBoolean();

        System.out.println("Bilet sayısı="+biletSayisi+ "\nSigorta istiyor mu= "+sigorta);

    }
}
