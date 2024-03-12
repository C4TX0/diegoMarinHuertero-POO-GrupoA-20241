import java.util.ArrayList;
import java.util.Random;

public class User {
    private Random ran = new Random();
    private int id;
    private String name;
    private int age;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> ownedBooks = new ArrayList<>();

    User(String name, int age){
        this.id = ran.nextInt(999)+1;
        this.name = name;
        this.age = age;
        BookStore.addUser(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getRentedBooks() {
        return books;
    }

    public ArrayList<Book> getOwnedBooks() {
        return ownedBooks;
    }

    public int getId() {
        return id;
    }
}
