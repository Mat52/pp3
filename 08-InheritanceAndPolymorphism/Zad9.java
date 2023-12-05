import java.lang.reflect.Array;
import java.util.ArrayList;

public class Zad9 {
    public static void main(String[] args) {
        Book book1 = new Book("Dzieci z Bullerbyn", "Astrid Lindgren");
        Ebook book2 = new Ebook("Dzieci z Bullerbyn", "Astrid Lindgren", "audiobook1");
        Ebook book3 = new Ebook("Pan Tadeusz", "Adam Mickiewicz", "audiobook2");
        Audiobook book4 = new Audiobook("Krzyżacy", "Henryk Sienkiewicz", 578, 12);
        Audiobook book5 = new Audiobook("Pan Tadeusz", "Adam Mickiewicz", 428, 12);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book i: books){
            i.display();
        }
    }
    
}
