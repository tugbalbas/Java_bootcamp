package Gun38.finalModifier;

public class javaFinalModifier {

    // final bu değişkeni öyle bir hale getirir ki ;
    // ister başlangıçta iserteniz
    // Consructorda değer atanır ve SONRA DEĞİŞTİRLEMEZ
    // SADECE İLK değer atanabilir.

    public static void main(String[] args) {
        final double pi=3.14; // değeri değiştirilemez.

        // pi=5; // tekrar değer atayabildim final demeden önce ama final dediğimde atayamadım.
        //  Cannot assign a value to final variable 'pi'
    }

}
