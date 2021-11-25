package Gun49.Extends1;

//subclass
public class Yonetici2 extends Personel {

    public void zamYap(int yuzde){
        System.out.println(yuzde+" oranında zam yapıldı");
    }
}
// Inheritance
// Yönetici classta hepsini tek tek yaptık
// fakat yönetici classta inheritance ile daha kolay bir yöntem oldu
// Yöneticide bir personel olduğu için sadece yöneticiye eklenecekleri ekledik
// extends + diğer class adı yazılarak o classtaki otmatik gelir
// Personelde yöneticinin kullanmmayacağı bir ddeğişken tanımlamak
// inheritance yöntemine engel değil