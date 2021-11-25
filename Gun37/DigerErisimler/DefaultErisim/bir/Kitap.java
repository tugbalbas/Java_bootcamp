package Gun37.DigerErisimler.DefaultErisim.bir;

public class Kitap {
    String name; //default

    Kitap(){  //default  kendi paketinin içindeki classlara erişebilir
    }
    public Kitap(String name){  // public
        this.name=name;
    }
}
