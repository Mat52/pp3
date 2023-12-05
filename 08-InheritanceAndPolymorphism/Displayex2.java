public class Displayex2 {
    public static void main(String[] args) {
        Book book2 = new Book("Dzieci z Bullerbyn", "Astrid Lindgren");
        Ebook book3 = new Ebook("Dzieci z Bullerbyn", "Astrid Lindgren", "audiobook1");
        Ebook book4 = new Ebook("Pan Tadeusz", "Adam Mickiewicz", "audiobook2");

        book2.display();
        book3.display();
        book4.display();
    }
        
}
