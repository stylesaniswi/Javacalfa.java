import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Book {
    int book_id;
    String author;
    String publiser;

    public static void main(String[] args) {
        char opt = 'y';
        Scanner sh = new Scanner(System.in);
        List<Book> bookList = new ArrayList<Book>();
        while (opt != 'n') {
            Book b = new Book();
            System.out.println("\nEnter Book ID:");
            b.book_id = Integer.parseInt(sh.nextLine());
            System.out.println("\nEnter Book Author:");
            b.author = sh.nextLine();
            System.out.println("\nEnter Book Publisher:");
            b.publiser = sh.nextLine();
            bookList.add(b);
            System.out.println("\nEnter more details?(y/n)");
            opt = sh.nextLine().charAt(0);
        }
        Iterator<Book> iterator = bookList.iterator();
        sh.close();
        while (iterator.hasNext()) {
            Book element = iterator.next();
            System.out.println("\nBook ID: " + element.book_id);
            System.out.println("\nBook Author: " + element.author);
            System.out.println("\nBook Publisher: " + element.publiser);
        }
    }
}
