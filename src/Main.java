import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char option;
        ArrayList<Integer> nab = new ArrayList<>();
        do {
            Scanner read = new Scanner(System.in);
            System.out.println("Bienvenido a la Libreria");
            System.out.println("""
                     [0] Registrar Usuario\s
                     [1] Iniciar sesion\s
                     [2] Registrar Libro\s
                     [3] Mostrar usuarios\s
                     [4] Mostrar libros en renta y rentados\s
                     [5] Mostrar libros comprados\s
                     [6] Mostrar usuario y sus libros\s
                     [7] Salir\
                    """);
            option = read.next().charAt(0);

            switch (option) {
                case '0':
                    System.out.println("\nRegistar Usuario");
                    System.out.print("Ingresa el nombre del usuario: ");
                    String name = read.next();
                    System.out.print("Ingresa la edad del usuario: ");
                    int age = read.nextInt();
                    new User(name, age);
                    System.out.printf("El usuario %s ha sido registrado\n",name);
                    break;
                case '1':
                    System.out.println("\nIniciar sesion");
                    if (BookStore.getUsers().isEmpty()){
                        System.out.println("Sin usuarios registrados");
                    }
                    else{
                        for (int i = 0; i < BookStore.getUsers().size(); i++) {
                            System.out.printf("[%d] %s\n",i,BookStore.getUsers().get(i).getName());
                        }
                        int uIndex = read.nextInt();
                        if (uIndex > BookStore.getUsers().size() || uIndex < 0){
                            System.out.println("Usuario Inexistente");
                        }
                        else{
                            do {
                                System.out.println("** Menu de Usuario **");
                                System.out.println("[0] Rentar Libro \n [1] Regresar Libro \n [2] Comprar Libro \n [3] Salir \n");
                                int bIndex;
                                option = read.next().charAt(0);
                                switch (option){
                                    case '0':
                                        System.out.println("* Rentar Libro *");
                                        for (int i = 0; i < BookStore.getBooks().size(); i++) {
                                            if (!BookStore.getBooks().get(i).getStatus()) {
                                                nab.add(i);
                                            } else {
                                                System.out.printf("[%d] %s Autor: %s\n",i,BookStore.getBooks().get(i).getTitle(),BookStore.getBooks().get(i).getAuthor());
                                            }
                                        }

                                        bIndex = read.nextInt();
                                        if (bIndex >= BookStore.getBooks().size() || bIndex < 0 || nab.contains(bIndex)) {
                                            System.out.println("Opción inválida");
                                        }
                                        else {
                                            BookStore.getUsers().get(uIndex).getRentedBooks().add(BookStore.getBooks().get(bIndex));
                                            BookStore.getBooks().get(bIndex).setStatus(false);
                                            System.out.println("Libro rentado");
                                        }
                                        nab.clear();
                                        break;
                                    case '1':
                                        System.out.println("* Regresar Libro *");
                                        for (int i = 0; i < BookStore.getUsers().get(uIndex).getRentedBooks().size(); i++) {
                                            System.out.println();
                                        }
                                        bIndex = read.nextInt();
                                        if (bIndex > BookStore.getUsers().get(uIndex).getRentedBooks().size() || bIndex < 0) {
                                            System.out.println("Opcion invalida");
                                        }
                                        else{
                                            BookStore.getUsers().get(uIndex).getRentedBooks().get(bIndex).setStatus(true);
                                            BookStore.getUsers().get(uIndex).getRentedBooks().remove(bIndex);
                                            System.out.println("Libro regresado");
                                        }
                                        break;
                                    case '2':
                                        System.out.println("* Comprar Libro *");
                                        for (int i = 0; i < BookStore.getBooks().size(); i++) {
                                            if (!BookStore.getBooks().get(i).getStatus()) {
                                                nab.add(i);
                                            } else {
                                                System.out.printf("[%d] %s Autor: %s\n",i,BookStore.getBooks().get(i).getTitle(),BookStore.getBooks().get(i).getAuthor());
                                            }
                                        }

                                        bIndex = read.nextInt();
                                        if (bIndex >= BookStore.getBooks().size() || bIndex < 0 || nab.contains(bIndex)) {
                                            System.out.println("Opción inválida");
                                        }
                                        else {
                                            BookStore.getUsers().get(uIndex).getOwnedBooks().add(BookStore.getBooks().get(bIndex));
                                            BookStore.getOwnedBooks().add(BookStore.getBooks().get(bIndex));
                                            BookStore.getBooks().remove(bIndex);
                                            System.out.println("Libro comprado");
                                        }
                                        nab.clear();
                                        break;
                                    case '3':
                                        break;
                                    default:
                                        System.out.println("Opcion invalida");
                                }

                            }while(option != '3');
                        }
                    }
                    break;
                case '2':
                    System.out.println("\nRegistar Libro");
                    System.out.print("Ingresa el titulo del libro: ");
                    String title  = read.next();
                    System.out.print("Ingresa el autor del libro: ");
                    String author  = read.next();
                    new Book(title,author);
                    System.out.printf("El libro %s ha sido registrado\n",title);
                    break;
                case '3':
                    System.out.println("\nMostrar usuarios");
                    BookStore.printUsers();
                    break;
                case '4':
                    System.out.println("\nMostrar libros");
                    BookStore.printBooks();
                    break;
                case '5':
                    System.out.println("\nLibros comprados");
                    for (int i = 0; i < BookStore.getOwnedBooks().size(); i++) {
                        System.out.printf("Titulo: %s Autor: %s ID: %d\n", BookStore.getOwnedBooks().get(i).getTitle(), BookStore.getOwnedBooks().get(i).getAuthor(), BookStore.getOwnedBooks().get(i).getId());
                    }
                    break;
                case '6':
                    System.out.println("\nMostrar usuarios y sus libros");
                    BookStore.showUsers();
                    break;
                case '7':
                    break;
                default:
                    System.out.println("Opcion invalida");

            }

        } while(option != '7');

    }
}
