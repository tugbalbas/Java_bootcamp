package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Odevler {
    public static void main(String[] args) {
//        ArrayList<String> list=new ArrayList<>();
//        list.add("Orange");
//        list.add("Kiwi");
//        list.add("Peach");
//        list.add("Banana");
//        list.add("Orange");
//        String str="Orange";
//        System.out.println(getCount(list, str));

//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(3);
//        list.add(4);
//        System.out.println(getSum(list));

//        ArrayList<String> list=new ArrayList<>();
//        list.add("New jersey");
//        list.add("New york");
//        list.add("Ohio");
//        list.add("Florida");
//        list.add("Boston");
//        System.out.println(getLength(list));

//        ArrayList<String> list=new ArrayList<>();
//        list.add("yellow");
//        list.add("red");
//        list.add("blue");
//        list.add("red");
//        list.add("blue");
//        String s1="blue";
//        String s2="yellow";
//        System.out.println(changelnArraylist(list,s1,s2));

//        ArrayList<String> list=new ArrayList<>();
//        list.add("New jersey");
//        list.add("New york");
//        list.add("Atlanta");
//        list.add("Florida");
//        list.add("Ohio");
//        System.out.println(rotateList(list));

//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(6);
//        list.add(2);
//        list.add(1);
//        System.out.println(hillNum(list));




    }



//        1-ismi getCount() olan bir method oluşturun.
//        Parametre olarak bir String ArrayList  ve  bir tane String
//        Return tipi int olmalı.
//        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//        Örneğin;
//        ArrayList = Orange , Kiwi , Peach , Banana , Orange
//        String Orange:
//        Count = 2 olmalı. (Orange 2 kez yazılmış)
//
    //1-
//    public static int getCount(ArrayList<String> arrayList, String text){
//        int count=0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i).contains(text))
//                count++;
//        }
//        return count;
//    }

//        2- getSum() isminde bir method oluşturun.
//        Parametresi ArrayList olmalı
//        Return tipi int olmalı.
//        ArrayList teki tüm sayıları birbiri ile toplayın.
//        return olarak toplam sonucu döndürün.
//        Örneğin;
//        Arraylist = 1,2,3,4,5
//        return 15 olmalı
    //2-
//    public static int getSum(ArrayList<Integer>arrayList){
//        int sum=0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            sum+= arrayList.get(i);
//        }
//        return sum;
//    }
//
//        3- getLength() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        Return tipi Integer ArrayList
//        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//        Tüm elementlerin uzunluğunu döndürün
//        Örneğin;
//        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//        Tüm Stringlerin uzunluklarını yazdırın;
//        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
//
    //3
//    public static ArrayList<Integer>getLength(ArrayList<String>arrayList){
//        ArrayList<Integer>integerArrayList=new ArrayList<>();
//        for (int i = 0; i < arrayList.size(); i++) {
//            integerArrayList.add(arrayList.get(i).length());
//        }
//        return integerArrayList;
//    }
//        4- İsmi changelnArraylist() olan bir method oluşturun.
//        Parametre olarak String ArrayList, String s1, String s2
//        Arraylist'te s1'i s2 olarak değiştirin
//        Return String arrayList
//        Örneğin;
//        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//        s1 = blue
//        s2 = yellow
//        Tüm blue 'ları yellow'a dönüştürün.
//        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
//
    //4-
//    public static ArrayList<String>changelnArraylist(ArrayList<String>stringArrayList, String s1, String s2){
//        for (int i = 0; i < stringArrayList.size(); i++) {
//            if (stringArrayList.get(i).contains(s1))
//                stringArrayList.set(i,s2);
//        }
//        return stringArrayList;
//    }
//        5- rotateList() isminde bir method oluşturun.
//        Parametre olarak String ArrayList
//        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
//        Tersten yazılmış halini return edin.
//        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
//        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
//
    //5-
//    public static ArrayList<String> rotateList(ArrayList<String>stringArrayList){
//        ArrayList<String>tersi=new ArrayList<>();
//        for (int i = stringArrayList.size()-1; i >=0; i--) {
//            tersi.add(stringArrayList.get(i));
//        }return tersi;
//    }
//        6- hillNum() isminde bir method oluşturun.
//        Parametre olarak Integer ArrayList
//        Return tipi int,
//        Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
//        Örneğin;
//        ArrayList  5,4,6,2,1 2, 6'dan küçük ve 1 den büyüktür.
//        Return 2 olmalı.
    //6-
//    public static int hillNum(ArrayList<Integer> arrayList){
//        int num=0;
//        for (int i = 1; i < arrayList.size()-1; i++) {
//            if (arrayList.get(i)<arrayList.get(i-1) && arrayList.get(i)>arrayList.get(i+1))
//                num= arrayList.get(i);
//        }
//        return num;
//    }
//
//        7- common_values() isminde bir method oluşturun.
//        Parametre olarak 2 tane Integer ArrayList
//        Return tipi integer ArrayList olmalı
//        İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
//        **Örneğin;**
//        ArrayList 1:    3 , 2 , 5 , 6
//        ArrayList 2:     5 , 8 , 9
//        return  5 olmalı
//        **Örneğin;**
//        ArrayList 1: 8,7,9,6,7
//        ArrayList 2: 6,7,12,3,1
//        return 6 ve 7 olmalı
    //7-
//    public static ArrayList<Integer>common_values(ArrayList<Integer>integerArrayList, ArrayList<Integer>integers){
//        ArrayList<Integer>ortak=new ArrayList<>(integerArrayList);
//        ortak.retainAll(integers);
//        return ortak;
//    }
//
//        8- secondMax()  isminde bir method oluşturun.
//        Parametre olarak integer ArrayList.
//        Return tipi int olmalı.
//        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
//        **ÖRN;**
//        ArrayList   --  5,3,4,6,7
//        CEVAP : 6
    //8-
//    public static int secondMax(ArrayList<Integer>arrayList){
//        int num=0;
//        int max= Collections.max(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (num<arrayList.get(i) && arrayList.get(i)<max)
//                num=arrayList.get(i);
//        }
//        return num;
//    }
//
//        9-
//                rangeBtw() isminde bir method oluşturun.
//        Parametre olarak   **bir Arraylist**  ve **iki ayrı int**
//        return tipi int
//        Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.
//        return  **count**       (sayacı (count) döndürün.)
//            **Example (Örnek):**
//        ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
//        min = 20
//        max = 30
//        return =  5    (20,22,25,28,30)
//        min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)

    //9-
//    public static int rangeBtw(ArrayList<Integer>arrayList, int num1, int num2){
//        int count=0;
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) <= num1 && arrayList.get(i) >= num2) // num2<arrayList.get(i)<num1
//                count++;
//        }
//        return count;
//    }
//
//        10- Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//        **Örnek:**
//      ```
//      **Girdi:**
//      [
//      [ 1, 2, 3 ],
//      [ 4, 5, 6 ],
//      [ 7, 8, 9 ]
//      ]
//      **Çıktı:** [1,2,3,4,5,6,7,8,9]

    //10-
//    public static void arrayeDonus(int[][]array){
//        ArrayList<Integer>arrayList=new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                arrayList.add(array[i][j]);
//            }
//        }
//        System.out.println("arrayList = " + arrayList);
//    }

}

