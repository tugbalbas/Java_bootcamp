package Pazar_Grup_Calismasi.Soru210321;

public class Employee {

    String isim;
    double maas;
    int calısmaSaati;
    int iseBasladigiYil;


    public static double vergi(Employee employee){
//        Employee employee=new Employee(); yukarda tanımlayıp parametrede kullandık!!

        if (employee.maas>1000) {
            return employee.maas * 0.03;
        }
        return 0.0;
    }

    public static double bonus(Employee employee){
        //        Employee employee=new Employee();v
        int ekstraSaat=employee.calısmaSaati-40;

        if (ekstraSaat>0){
            return ekstraSaat*30;
        }else
            return 0.0;
    }

    public static double maasArtisi(Employee employee){
        //        Employee employee=new Employee();
        int yil= 2021-employee.iseBasladigiYil;
        if (yil<10){
            return employee.maas*0.5;
        }else if (yil>=10 && yil<20){
            return employee.maas*0.10;
        }else
            return employee.maas*0.15;

    }

    public static void bilgiYaz(Employee employee){
        //        Employee employee=new Employee();
        System.out.println("Vergi: "+vergi(employee));
        System.out.println("Bonus: "+bonus(employee));
        System.out.println("Maaş Artışı: "+maasArtisi(employee));
        double toplamMaas=employee.maas-vergi(employee)+bonus(employee);
        System.out.println("Toplam maaş: "+toplamMaas);
        System.out.println("Maaş zam ilie birlikte: "+maasArtisi(employee));
    }
    public static Employee calisanBilgi(String isim,double maas,int calısmaSaati,int iseBasladigiYil){
        Employee yeniCalisan=new Employee();
        yeniCalisan.isim=isim;
        yeniCalisan.maas=maas;
        yeniCalisan.calısmaSaati=calısmaSaati;
        yeniCalisan.iseBasladigiYil=iseBasladigiYil;

        return yeniCalisan;
    }

}
