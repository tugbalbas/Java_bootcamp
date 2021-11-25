package Gun47.Encapsulation_Odev_5;

import java.util.Scanner;

public class Odev5 {
    /*
    Book class'ı verilmiştir.

    İki tane attributes oluşturunuz.

    bookName ve authorName (String ile)

    Book class'ını kapsülleyin. (Encapsulate)

    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

            "Book name is BOOKNAME and Author is AUTHORNAME"





            import java.util.*;
*/

    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kitap adı giriniz: ");
            String bookname = scan.nextLine();
            System.out.println("Lütfen yazar giriniz: ");
            String authorname  = scan.nextLine();
//BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.
            Book book= new Book();
            System.out.println("Book name is "+bookname+" and"+" Author is "+authorname);
        }
    }

    static class Book{
        String bookName;
        String authorName;

        public Book() {
        }
        public Book(String bookName, String authorName) {
//            this.bookName = bookName;
//            this.authorName = authorName;
            setBookName(bookName);
            setAuthorName(authorName);
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bookName='" + bookName + '\'' +
                    ", authorName='" + authorName + '\'' +
                    '}';
        }
    }
}
