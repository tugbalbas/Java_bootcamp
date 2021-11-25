package Gun48.Soru1;

public class User {
   private int id; // bu oluşturulacak nesneye ait
   private String username;
   private String password;
   private boolean active;
   private boolean signedIn;

   private static int idSayac=1; // bu nesnelerin  dışında classa ait bir sayaç

    // Kullanıcıdan id bilgisi almadığı için p.içi 'int id' siliyoruz.
    // boolean değerler default olabilir dediği için onlaarı da siliyoruz
    // Encaps. için this leri set ile değiştiriyoruz
    public User(String username, String password) {
//        this.username = username;
//        this.password = password;

        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);
        setId(); // dışardan almayacağı için içi boş sistem otom verir, sayaçla
        // hata olan yerin altına alındığı anda hata durumlarında ID artmaz

    }


    public int getId() {
        return id;
    }

    // erişilmesin diye private yapıyoruz
    private void setId() {
        this.id = idSayac++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    // CHECKED Exception olmadığında bu metodun kullanılacağı nihai yer
    // mutlaka try catch kontrolü yapmalı yoksa program kırılır.
    // Kullanıcı dostu olmamış olur
    public void setPassword(String password) {
        if (password.length() < 6)
            throw new RuntimeException("Şifre 6 karakterden az olamaz");
        else
            this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
