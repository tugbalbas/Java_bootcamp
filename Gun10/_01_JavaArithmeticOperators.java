package Gun10;

public class _01_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1;  //  sayac++;  aynı işlemi yapıyor.
        sayac=sayac-1;  //  sayac--;  aynı işlemi yapıyor.

        sayac++; // bu satırdan sonra sayac=1 oldu.
        sayac--; // bu satırdan sonra sayac=0 oldu.

        ++sayac; // sayac++ ile aynı, kendi başına kullanıldığı zaman
        --sayac; // sayac-- ile aynı, kendi başına kullanıldığında başka değişkenle işleme girmiyorsa

        int sonuc=0;

        // sayac =0
        sonuc = ++sayac; // olduğunda ++ lar solda ise önce artır sonra eşitle.yani
        // bu işlemin karşılığı şudur : sayac=sayac+1; sonuc = sayac;
        // buna göre önce sayac 1 artar sonra sonuc a eşitlenir.
        // buna göre sonuc = 1, sayac=1


        // sayac=1
        sonuc = sayac++; // olduğunda ++ lar sağda ise önce eşitle sonra artır.
        // bu işlemin karşılığı şudur: sonuc=sayac; sayac=sayac+1;
        // sonuc =1, sayac=2
    }
}
