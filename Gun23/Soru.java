package Gun23;

import java.util.Arrays;

public class Soru {
    public static void main(String[] args) {
        //"aaabbccccdeeeff" seklinde verilen bir stringi yine string
        // olarak "3a2b4c1d3e2f" seklinde yazdiran methodu

        String verilen = "baabccbccdccdefeeffaa";
        frekansBul(verilen);
        frekansBulAlfabetik(verilen);
    }

    private static String frekansBul(String verilen) {

        String yeni="";

        for(int i=0;i<verilen.length();i++)
        {
            int miktar=0;
            for(int j=0;j<verilen.length();j++)
            {
                if (verilen.charAt(i)==verilen.charAt(j))
                    miktar++;
            }

            String arananHarf= String.valueOf(verilen.charAt(i));

            if (!yeni.contains(arananHarf))
                yeni=yeni+miktar+verilen.charAt(i);
        }

        System.out.println("yeni = " + yeni);

        return yeni;
    }


    private static String frekansBulAlfabetik(String verilen) {

        String yeni="";
        int miktar=0;

        String[] liste=verilen.split("");
        Arrays.sort(liste);

        for (int i=0;i<liste.length;i++){
            for (int j=0;j< liste.length;j++){
                if (liste[i].equals(liste[j]))
                    miktar++;
            }
            if (!yeni.contains(liste[i]))
                yeni=yeni+miktar+liste[i];
            miktar=0;
        }

        System.out.println("yeni = " + yeni);
        return yeni;
    }




}
