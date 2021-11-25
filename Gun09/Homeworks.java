package Gun09;

public class Homeworks {
    public static void main(String[] args) {

//        1- Crete a String which is :  "made to order" change the e to K   ,  print the result
//        2- Create a String which is : London
//        Make the String upper case, Print the String.
//        3- Create a String which is : NEW YORK
//        Make the String lower case,  Print the String.
//        4- Create a String which is $52.00
//        remove $ sign , print the String.
//        5- Create a String which is :"     Techno Stuu    dyy       "
//        remove the spaces from the beginning and end of the string
//        print the string.

        String text="made to order";
        System.out.println(text.replace('e','K'));
        String text2="London";
        System.out.println(text2.toUpperCase());
        String text3="NEW YORK";
        System.out.println(text3.toLowerCase());
        String text4="$52.00";
        System.out.println(text4.replace("$",""));
        String text5="     Techno Stuu    dyy       ";
        System.out.println(text5.trim());

    }
}
