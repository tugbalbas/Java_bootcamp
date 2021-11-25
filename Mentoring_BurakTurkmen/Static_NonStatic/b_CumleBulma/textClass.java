package Mentoring_BurakTurkmen.Static_NonStatic.b_CumleBulma;

public class textClass {
    String text1 ="Yazılım öğreniyorum.";
    String text2 ="Java kursu devam ediyor";


    public String ilkYarisi(String text){

        int baslangic = 0;
        int ortasi = text.length()/2;

        return text.substring(baslangic,ortasi);

    }

    public String ikinciYarisi(String text){

        int ortasi = text.length()/2;
        return text.substring(ortasi);


    }
}


