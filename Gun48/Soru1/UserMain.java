package Gun48.Soru1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        ArrayList<User> users=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int sayac=1;
        boolean userNameIste=true;
        String username="";

        do {
            if(userNameIste) { // eğer bu true ise username isticek
                System.out.print(sayac + ".Username: ");
                username = oku.nextLine();
            }
            System.out.print(sayac+".Password: ");
            String password=oku.nextLine();

            try {
                User user = new User(username, password);
                users.add(user);
                sayac++;
                userNameIste=true; // her şey doğru çalışırsa true olucak
            }
            catch (Exception ex){
                userNameIste=false; // hata olduğu zaman istemicek
                System.out.println("Hata mesajı: " + ex.getMessage());
            }

        }while (users.size() < 2);

        for (User u:users )
        {
            System.out.println("u = " + u);
        }

    }

}
