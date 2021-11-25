package Gun33._02_Soru;

public class myMath {

    //static koymazsak new ile oluşturmak zorundayız
    public static int getMin(int value1, int value2){
        return Math.min(value1,value2);
    }

    public static int getMax(int value1, int value2){
        return Math.max(value1,value2);
    }

    public static int getMutlak(int value){
        return Math.abs(value);
    }

    public static double getUs(int value1, int value2){
        return Math.pow(value1,value2);
    }

    public static double getKarekok(int value){
        return Math.sqrt(value);
    }

    public static int diziTopla(int[] dizi){
        int toplam=0;
        for(int e: dizi)
            toplam+= e;

        return toplam;
    }
}
