public class Displayex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Pan Tadeusz", "Adam Mickiewicz");
        Audiobook book2 = new Audiobook("Krzyżacy", "Henryk Sienkiewicz", 578, 12);
        Audiobook book3 = new Audiobook("Pan Tadeusz", "Adam Mickiewicz", 428, 12);

        book1.display();
        book2.display();
        book3.display();
    }
    
}
