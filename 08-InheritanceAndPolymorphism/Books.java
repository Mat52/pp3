public class Books {
    public static void main(String[] args) {
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz");
        Book book2 = new Book("Dzieci z Bullerbyn", "Astrid Lindgren");
        Ebook book3 = new Ebook("Dzieci z Bullerbyn", "Astrid Lindgren", "audiobook1");

        book1.display();
        book2.display();
        book3.display();
    }
}
