package _15_Non_AccessModifiers.Static;

import java.time.Period;

public class Person {

    public String name;
    public static String cityName;

  public  void print(){

      System.out.println("Name : "+ name);
      System.out.println("city : "+ cityName);
      System.out.println();

  }


    public static void main(String[] args) {

        Person person1=new Person();
        person1.name="omer";
        Person.cityName="bursa";
        person1.print();

//
        Person person2=new Person();
        person2.name="mehmet";
        Person.cityName="Amasya";
        person2.print();
//
        person1.print();
        person2.print();


    }


}
