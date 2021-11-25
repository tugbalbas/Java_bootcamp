package _15_Non_AccessModifiers.Final;

public class FinalModifier {

     private final int number;


     public FinalModifier(int number){
         this.number=number;
     }

    public static void main(String[] args) {

         FinalModifier fm=new FinalModifier(10);
        System.out.println(fm.number);

       // fm.number=15;

    }

}
  class FinalDeneme{


    private final int finaldegisken=10;

    public void printFinal(){

       // finaldegisken=10;
    }

  }