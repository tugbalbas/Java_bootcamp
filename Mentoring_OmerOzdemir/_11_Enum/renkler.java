package Mentoring_OmerOzdemir._11_Enum;
/*
Enum renkler oluşturun. (main class i ile aynı classta olsun.)
Trafik lambası mantığı ile hareket edin. Her rengin parametresi olarak kuralını yazın. örn: KIRMIZI("DUR")   (KIRMIZI , SARI , YEŞİL için)

main methodunun içerisinde bu değerleri parametreleri ile beraber yazdırın.
ipucu:  array a atayın     -    foreach

Konsol böyle olmalı:

Renk : KIRMIZI    kural: DUR
Renk : SARI    kural: HAZIR OL
Renk : YESİL    kural: GEÇ
 */
public enum renkler {
    KIRMIZI("DUR"),
    SARI("BEKLE"),
    YESİL("GEC");

    // verilen değerlerin içerisindeki değeri nitelendirmek için hemen bir değişken oluşturuyorum
    private final String kural;

    // constructor otomatik parametreli çıktığı için, string kuralı bu parametreye eşitlemek zorundayız
    renkler(String s){
        kural=s;
    }
    public String getKural(){
        return kural;
    }


    public static void main(String[] args) {
        renkler[] renk=renkler.values();

        for (int i = 0; i < renk.length; i++) {
            System.out.println("Renkler: " + renk[i].name()+" Kural: "+renk[i].getKural());
        }
    }

}
