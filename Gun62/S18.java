package Gun62;

public class S18 {
    public static void main(String[] args) {

        String [][] chs=new String [5][2];// satır sayısı:5

        chs[0]=new String[2];
        chs[1]=new String[5];

        int i=97;

        System.out.println(chs.length);

        for (int a=0; a<chs.length;a++){
            for (int b=0;b< chs.length;b++){
                chs[a][b]=""+i;
                i++;
            }

        }

        for(String[]ca:chs){
            for (String c: ca){
                System.out.println(c+"");
            }
            System.out.println();
        }

    }
}

//5
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//	at Gun62.S18.main(S18.java:17)