from Libreria import BookStore
from Libro import Book
from Usuario import User

book_store = BookStore()

if __name__ == "__main__":
    while True:

        print("Bienvenido a la Libreria")
        print(" [0] Registrar Usuario \n [1] Iniciar sesion \n [2] Registrar Libro \n "
              "[3] Mostrar usuarios \n [4] Salir")
        option = int(input("Ingresa la opción: "))

        if option == 0:
            print("\nRegistar Usuario\n")
            name = input("Ingresa el nombre del usuario: ")
            edad = int(input("Ingresa la edad del usuario: "))
            user = User(name, edad)
            book_store.add_user(user)
            print(f"El usuario {name} ha sido registrado\n")

        elif option == 1:
            print("\nIniciar sesion")
            i = 0
            if len(book_store.get_users()) == 0:
                print("Sin usuarios registrados")

            else:
                for user in book_store.get_users():
                    print(f"[{i}] {user.get_name()}")
                    i += 1

                u_index = int(input("Ingrese su opcion: "))
                if u_index > len(book_store.get_users()) or u_index < 0:
                    print("Usuario Inexistente")
                else:
                    while True:
                        print("** Menu de Usuario **")
                        print("[0] Rentar Libro [1] Regresar Libro [2] Salir")
                        option = int(input("Ingresa la opción: "))

                        if option == 0:
                            print("* Rentar Libro *")
                            i = 0
                            nab = []
                            for book in book_store.get_books():
                                if not book.get_status():
                                    nab.append(i)
                                    i += 1
                                else:
                                    print(f"[{i}] {book.get_title()} Autor: {book.get_author()} ")
                                    i += 1

                            b_index = int(input("Ingrese su opcion: "))
                            if b_index > len(book_store.get_books()) or b_index < 0 or b_index in nab:
                                print("Opcion invalida")
                            else:
                                book_store.get_users()[u_index].get_books_list().append(
                                    book_store.get_books()[b_index])
                                book_store.get_books()[b_index].set_status(False)
                                print("Libro rentado")

                        elif option == 1:
                            print("* Regresar Libro *")
                            i = 0
                            for book in book_store.get_users()[u_index].get_books_list:
                                print(f"[{i}] {book.get_title()} Autor: {book.get_author()} ")
                                i += 1
                                b_index = int(input("Ingrese su opcion: "))
                                if b_index > len(book_store.get_users()[u_index].get_books_list) or b_index < 0:
                                    print("Opcion invalida")
                                else:
                                    book_store.get_users()[u_index].get_books_list().pop(b_index)
                                    book_store.get_books()[b_index].set_status(True)
                                    print("Libro regresado")

                        elif option == 2:
                            break

                        else:
                            print("\nOpcion Invalida\n")

        elif option == 2:
            print("\nRegistar Libro\n")
            title = input("Ingresa el titulo del libro: ")
            author = input("Ingresa el autor del libro: ")
            book = Book(title, author)
            book_store.add_book(book)
            print(f"El libro {title} ha sido registrado\n")

        elif option == 3:
            print("\nMostrar usuarios\n")
            book_store.show_users()

        elif option == 4:
            break

        else:
            print("\nOpcion Invalida\n")
