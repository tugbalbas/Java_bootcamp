package Gun47.Encapsulation_Odev_1;

import java.util.Scanner;

public class odev_1 {
    /*
    1-

    Burada iki adet class vardır. Biri **Main**, diğeri ise **student ,**

            **student classı içinde;**

    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.

    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.

            **Main classın içinde**;

    Örnek:

            **age 12**'dir.

            **name Steven**'dır.

    name(isim) olarak;

**"Student name is Steven"**

    ve

    age(yaş) olarak da;

**"He is 12 years old"**

     */

    static class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen isim giriniz: ");
            String n1 = scan.nextLine();
            System.out.println("Lütfen yaş giriniz: ");
            int i1 = scan.nextInt();

            //BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


            Student student=new Student();
            System.out.println("Student name is " + n1);
            System.out.println("He is "+i1+" years old");

        }
    }


    static class Student{
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
//            this.name = name;
//            this.age = age;
            setName(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
