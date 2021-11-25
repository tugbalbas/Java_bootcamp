package Mentoring_OmerGoker._14_Constructors._02_Constructor;

public class SuperLig {
    public static void main(String[] args) {

        // mainde Nesne oluşturma _ uzun yol
        Takim takim1=new Takim();
        System.out.println(takim1.ad); // daha özellikleri belirlenmediği için yazmadı 'null'
        takim1.ad="Besiktas";
        takim1.renkler="siyah-beyaz";
        takim1.kurulusYili=1903;
        System.out.println(takim1.ad);

        // methodla nesne oluşturma
        Takim takim2=Takim.takimOlustur("Galatasaray","sari-kirmizi",1905);
        System.out.println("takim2.ad = " + takim2.ad);



    }
}
