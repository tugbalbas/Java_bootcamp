package _16_StringBuffer_StringBuilder;

import java.util.Arrays;

public class _02_StringBuilder {



    public static void main(String[] args) {

        /* todo
            Stringbuilder
                mutable,degistirikebilir string elde ediyoruz
                thread-safe degildir. synchronized degildir

        */
        //***************** StringBuilder Metodlari********************************


        //Append
         StringBuilder stringBuilder=new StringBuilder("bu bir Stringbuildeer nesnesi");
         StringBuilder stringBuilder2=new StringBuilder("bu da");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder2);


       StringBuilder builder=new StringBuilder();
       builder.append("Ali");
       builder.append(" ata");
       builder.append(" bak");
        System.out.println(builder);



        System.out.println(builder.length());

        builder.append(123);


        //Reverse
           builder.reverse();
        System.out.println("builder reverse ="+builder);
          builder.reverse();
        System.out.println(builder);

        //delete

               builder.delete(0,5); // 0 dahil 5 haric index karekterleri silecek
        System.out.println("builder delete ="+builder);
        builder.deleteCharAt(0);
        System.out.println("delete char = "+ builder);



        //insert
        builder.insert(1,"456");
        System.out.println(builder);

        //new
        builder = new StringBuilder("ömer misir sever");
        System.out.println("builder new ="+ builder);

        //replace

        builder.replace(5,10,"muz");
        System.out.println(builder);


    }




}

