package Gun47.Encapsulation_Odev_2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class odev_2 {
    /*
    Burada iki adet class vardır. Biri Main diğeri ise Employees,
            **Employees(Çalışanlar) class'ında;**
    Bu variable'ları oluşturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.
            **Main class'ın içinde;**
    _Örnek:_
    _Name is Fernando_
    _Salary is 80000_
    _dob is 11/23/2000_

            **main method'un içinde,**
    Eğer employee 18 yaşında büyükse, **Welcome to our company Fernando your salary is 80000.** yazdırınız.
    Eğer Fernando 18 yaşından küçükse, **come back when you are 18 years old.** yazdırınız.
    Eğer Fernando 18 yaşındaysa,  **we can have inter with you after that you can have a 80000 salary** yazdırınız.
```
    ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
```
*/

    static class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen isim giriniz: ");
            String name = scan.nextLine();
            System.out.println("Lütfen maaş giriniz: ");
            int salary = scan.nextInt();
            System.out.println("Doğum tarihinizi giriniz: ");
            String dop = scan.nextLine();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

            Employees employees1=new Employees();

            System.out.println(employees1.getName());
            System.out.println(employees1.getSalary());
            System.out.println(employees1.getDob());
        }
    }

    static class Employees{

        private String name;
        private int salary;
        private String dob;

        public Employees() {
        }

        public Employees(String name, int salary, String dob) {
            setName(name);
            setSalary(salary);
            setDob(dob);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {

            this.dob = dob;
            LocalDate dtDogumGunu = LocalDate.of(1994,9,2);
            LocalDate bugun = LocalDate.now();

            Period fark = Period.between(dtDogumGunu,bugun);

            System.out.println("fark = " + fark);
            System.out.println("fark.getYears() = " + fark.getYears());
            System.out.println("fark.getMonths() = " + fark.getMonths());
            System.out.println("fark.getDays() = " + fark.getDays());

            System.out.println("fark.getYears() +\" Yıl, \"+ = " + fark.getYears() + " Yıl, " +
                    fark.getMonths()+" ay, "+fark.getDays()+" gün");
        }

        @Override
        public String toString() {
            
            return "Employees{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", dob='" + dob + '\'' +
                    '}';
        }

        //        ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age

        public void ageCalculator(){

            LocalDate dtDogumGunu = LocalDate.of(1994,9,2);
            LocalDate bugun = LocalDate.now();

            Period fark = Period.between(dtDogumGunu,bugun);



        }

    }



}
