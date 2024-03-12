import java.util.Random;

public class Book {
    private Random ran = new Random();
    private int id;
    private String title;
    private String author;
    private boolean available;

    Book(String title, String author){
        this.id = ran.nextInt(999)+1;
        this.title = title;
        this.author = author;
        this.available = true;
        BookStore.addBook(this);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return available;
    }

    public void setStatus(boolean status){
        available = status;
    }
}
