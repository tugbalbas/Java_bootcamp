package MentoringHaftaiçi.Mentoring_9_Classlar;

public class b_Static_vs_NonStatic {
    public static void main(String[] args) {
        // static olunca sadece ismini yazmamız yeterli oluyor
        // tek classta çalışıyorsam ve methodum static ise, ismini direkt yazarak o methodu kullanabilirsiniz
        buMethodStatic();
        // buMethodStaticDegil(); static olmadığı için böyle çağıramıyoruz
        // static olmayan methodlar için, o class ismi ile bir obje (Referans) oluşturulmalı ve isimlendirilmeli
        // Daha sonra bu ismi kullanarak, o classtaki değişkenlere ve methodlara ulaşabilirsiniz.
        // static olmayanı çağırmak için:

        b_Static_vs_NonStatic yeniObje = new b_Static_vs_NonStatic();
        yeniObje.buMethodStaticDegil();

    }
    public static void buMethodStatic(){ // Static patrondur. Her yere istediği gibi ismiyle çağrılabilr
        System.out.println("Ben bir static methodum.");
    }
    public void buMethodStaticDegil(){ // işçi olarak düşünün. Main methodunda kullanılması için iziin(obje) olması gerekiyor
        System.out.println("Ben bir static method değilim.");
    }
}
