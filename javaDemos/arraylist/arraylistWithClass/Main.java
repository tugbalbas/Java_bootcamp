package javaDemos.arraylist.arraylistWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<Customer>();

        customers.add(new Customer(1,"Tugba","Albas"));
        customers.add(new Customer(2,"Engin","Demirog"));
        customers.add(new Customer(3,"Derin","Demirog"));

        // customers.remove(new Customer(2,"Engin","Demirog")); listeden silinmez
        for (Customer customer : customers){
            System.out.println("customer.firstName = " + customer.firstName);
        }
    }
}
