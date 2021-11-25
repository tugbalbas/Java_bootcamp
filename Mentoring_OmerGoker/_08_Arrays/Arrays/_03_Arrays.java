package Mentoring_OmerGoker._08_Arrays.Arrays;

public class _03_Arrays {
    public static void main(String[] args) {


        char[] letters = {'H', 'e', 'l', 'l', 'o'};


        System.out.println(letters.length);

        for (int i = 0; i <letters.length ; i++) {
            System.out.print(letters[i]);
        }
        System.out.println();
        for (int i = letters.length-1; i >=0 ; i--) {
            System.out.print(letters[i]);
        }



    }
}
