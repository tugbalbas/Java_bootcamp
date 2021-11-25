package Gun29;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
       
        Map<String, String> semihKartvizit = new HashMap<>();
        semihKartvizit.put("isim","semih nerde");
        semihKartvizit.put("e-mail","semih@hotmail.com");
        semihKartvizit.put("adres","Frankfurt/Almanya");
        semihKartvizit.put("telefon","0 532 2300000");

        System.out.println("semihKartvizit.get(isim) = " + semihKartvizit.get("isim"));
        System.out.println("semihKartvizit.get(telefon) = " + semihKartvizit.get("telefon"));

        Map<String, String> ismailKartvizit = new HashMap<>();
        ismailKartvizit.put("isim","ismail nerde");
        ismailKartvizit.put("e-mail","isimail@hotmail.com");
        ismailKartvizit.put("adres","Almanya");
        ismailKartvizit.put("telefon","0 532 23000");

        System.out.println("ismailKartvizit.get(isim) = " + ismailKartvizit.get("isim"));
        System.out.println("ismailKartvizit.get(telefon) = " + ismailKartvizit.get("telefon"));

           // semih        kartviziti
        Map<String, Map<String,String> > kartvizitler = new HashMap<>();
        kartvizitler.put("semih", semihKartvizit);
        kartvizitler.put("ismail", ismailKartvizit);

        System.out.println("kartvizitler.get(semih).get(telefon) = " + kartvizitler.get("semih").get("telefon"));
        System.out.println("kartvizitler.get(ismail) = " + kartvizitler.get("ismail"));
        System.out.println("kartvizitler = " + kartvizitler);


    }
}
