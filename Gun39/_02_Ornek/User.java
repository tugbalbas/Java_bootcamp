package Gun39._02_Ornek;

public class User {
    String name;
    Role role; // 1-Admin,
    Statu statu; // 1-Aktif

    public User(String name, Role role, Statu statu) {
        this.name = name;
        this.role = role;
        this.statu = statu;
    }
}
