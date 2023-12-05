public class Ebook extends Book {

    private String filename;

    public Ebook(String title, String author, String filename) {
        super(title, author);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void display(){
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", Filename: " + filename);
    }

    
    
}
