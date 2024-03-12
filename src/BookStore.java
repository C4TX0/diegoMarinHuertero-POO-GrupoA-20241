import java.util.ArrayList;

public class BookStore {

    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Book> ownedBooks = new ArrayList<>();

    public static void addUser(User user){
        users.add(user);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static ArrayList<Book> getOwnedBooks() {
        return ownedBooks;
    }

    public static void addBook(Book book){
        books.add(book);
    }

    public static void printUsers(){
        if (!users.isEmpty()){
            for (int i = 0; i < users.size(); i++) {
                System.out.printf("Nombre: %s Edad: %d ID: %d\n", users.get(i).getName(),users.get(i).getAge(),users.get(i).getId());
            }
        }
        else{
            System.out.println("Sin usuarios registrados");
        }
    }

    public static void printBooks(){
        if (!books.isEmpty()){
            System.out.println("* Libros en renta *");
            for (int i = 0; i < books.size(); i++) {
                System.out.printf("Titulo: %s Autor: %s ID: %d\n", books.get(i).getTitle(),books.get(i).getAuthor(),books.get(i).getId());
            }
        }
        else{
            System.out.println("Sin libros registrados");
        }

        if (!books.isEmpty()){
            System.out.println("* Libros comprados *");
            for(int i = 0; i < ownedBooks.size(); i++) {
                System.out.printf("Titulo: %s Autor: %s ID: %d\n", ownedBooks.get(i).getTitle(),ownedBooks.get(i).getAuthor(),ownedBooks.get(i).getId());
            }
        }
        else{
            System.out.println("Sin libros registrados");
        }
    }

    public static void showUsers(){
        if (!users.isEmpty()){
            for (int i = 0; i < users.size(); i++) {
                System.out.printf("Nombre: %s Edad: %s ID: %d\n", users.get(i).getName(),users.get(i).getAge(),users.get(i).getId());
                if (users.get(i).getRentedBooks().isEmpty()){
                    System.out.println("Sin libros rentados");
                }
                else{
                    System.out.println("* Libros Rentados *");
                    for (int j = 0; j < users.get(i).getRentedBooks().size(); j++) {
                        System.out.printf("Titulo: %s Autor: %s ID: %d\n", users.get(i).getRentedBooks().get(j).getTitle(), users.get(i).getRentedBooks().get(j).getAuthor(), users.get(i).getRentedBooks().get(j).getId());
                    }
                }

                if (users.get(i).getOwnedBooks().isEmpty()){
                    System.out.println("Sin libros comprados");
                }
                else{
                    System.out.println("* Libros Comprados *");
                    for (int j = 0; j < users.get(i).getOwnedBooks().size(); j++) {
                        System.out.printf("Titulo: %s Autor: %s ID: %d\n", users.get(i).getOwnedBooks().get(j).getTitle(), users.get(i).getOwnedBooks().get(j).getAuthor(), users.get(i).getOwnedBooks().get(j).getId());
                    }
                }
            }
        }
        else{
            System.out.println("Sin usuarios registrados");
        }
    }

}
