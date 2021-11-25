package Mentoring_OmerGoker._12_Collections_Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_Arraylist {

    public static void main(String[] args) {


//    TODO
//    String arrayList oluşturun.
//    1.  elemanEkle isminde bir method oluşturun
//        ve bana String Arraylist döndürsün. Parametre olarak String arraylist.
//        Scanner kullanarak  5 özel isim girin ve bu isimler bu methodda ArrayListe eklensin. (Hüseyin, Ömer,Nalan vb.)
//    2.  sil isminde void bir method çağırın.
//        Parametresi String ArrayList olsun.
//        ArrayListimin içindeki elemanlardan "l" harfine sahip olan varsa yazdirsin
//        ve daha sonra bütün arrayList temizlensin. (boşaltılsın.)
//    3.  listeBosMu   adında void bir method oluşturun ve parametresi String ArrayList olsun.
//        Listenin boş olup olmadıgını check etsin. Liste boş ise true,  boş değil ise false döndürsün.  (ArrayList methodu kullanın.)
//        Liste boş ise  listeyi yazdırıp check edin.


    ArrayList<String> arrayList =new ArrayList<>();

        System.out.println(elemanEkle(arrayList));
        System.out.println();
        sil(arrayList);

        System.out.println();

        listeBosmu(arrayList);



}
  public static ArrayList<String> elemanEkle(ArrayList<String> arr){
       Scanner scr=new Scanner(System.in);
       String eleman="";
      for (int i = 0; i <5 ; i++) {
          System.out.print("bir isim giriniz: ");
          eleman=scr.nextLine();
          arr.add(eleman);

      }

        return arr;
  }

  public static void sil(ArrayList<String> arrayList){

        int sayac=0;
      for (int i = 0; i <arrayList.size() ; i++) {
          if (arrayList.get(i).toLowerCase().contains("l")){

              System.out.println(arrayList.get(i));
              sayac++;
          }

      }

      if (sayac>0){
          arrayList.clear();
          System.out.println("liste bosaltilmistir");
      }
        else
          System.out.println("listede l harfi iceren bir isim yoktur");


  }

  public static void listeBosmu(ArrayList<String> arrayList){

      System.out.println("liste bos mu :"+ arrayList.isEmpty());

      if (arrayList.isEmpty())
          System.out.println("liste bostur  " + arrayList);

    }

}
