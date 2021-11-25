package Gun47.Ornekler.Ornek1;

public class KisiMain {
    public static void main(String[] args) {
        Kisi necdetKisisi=new Kisi();

        necdetKisisi.ad="Necdet";
        necdetKisisi.soyad="Demir";

        // necdetKisisi.yas= -25; erişimini engellemek için 'private' yapıyoruz
        necdetKisisi.setYas(-25);
        int yasi=necdetKisisi.getYas(); // yas bilgisine ulaşabşlmek şçşn get yapmak zorundayız
        System.out.println("necdetKisisi = " + necdetKisisi);

    }


}



                // System.out.println("kisi1. = " + kisi1.); bu şekilde yazdırma işlemi
                // yapamadığımız için bir de 'get' oluşt (paranteziçi sayı ister)

                // System.out.println("kisi1.getYas() = " + kisi1.getYas());
