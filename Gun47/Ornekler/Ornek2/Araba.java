package Gun47.Ornekler.Ornek2;

public class Araba {
    private String renk;
    private String model;
    private int motor;
    private int kapiSayisi;

    // boş cons yapmamızın sebebi buraya müdahale ettiğimiz an yani
    // dolu cons yaptığımz zamna kontroü bize bırakıyor
    // bu nedenle arkada gizli olan boşu yapmak zorunda oluyorsun
    public Araba() {
        // burdaki boş cons ilk oluşturulan nesnenin yerini tutuyor
        // alttaki dolu olan da 2. nesne
    }

    public Araba(String renk, String model, int motor, int kapiSayisi) {
        setRenk(renk); //this.renk = renk;
        setModel(model); //this.model = model;
        setMotor(motor); //this.motor = motor;
        setKapiSayisi(kapiSayisi); //this.kapiSayisi = kapiSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    // bunları yazmazsan encapsulation yapmış olmazsın
    // bunların dışındaki değerler '0' gelir
    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi == 2 || kapiSayisi == 4)
            this.kapiSayisi = kapiSayisi;
        else
            System.out.println("Kapı sayısı 2 veya 4 olabilir");
    }

    // bilgilerini yazdırabilmek için
    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motor=" + motor +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
