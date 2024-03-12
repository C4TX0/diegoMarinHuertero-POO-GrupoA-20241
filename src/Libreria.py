class BookStore:
    __users = []
    __books = []
    __owned_books = []

    def add_user(self, user):
        self.__users.append(user)

    def get_users(self):
        return self.__users

    def get_books(self):
        return self.__books

    def get_owned_books(self):
        return self.__owned_books

    def add_book(self, book):
        self.__books.append(book)

    def print_users(self):
        for user in self.__users:
            print(f"\nNombre: {user.get_name()} Edad: {user.get_age()} ID: {user.get_id()}")

    def print_books(self):
        if len(self.__books) > 0:
            print("* Libros en renta *")
            for book in self.__books:
                print(f"Titulo: {book.get_title()} Autor: {book.get_author()} ID: {book.get_id()}")
        else:
            print("Sin Libros en renta")
        if len(self.__owned_books) > 0:
            print("* Libros comprados *")
            for book in self.__owned_books:
                print(f"Titulo: {book.get_title()} Autor: {book.get_author()} ID: {book.get_id()}")
        else:
            print("Sin Libros comprados")

    def show_users(self):
        print("** USUARIOS **")
        for user in self.__users:
            print(f"\nNombre: {user.get_name()} Edad: {user.get_age()} ID: {user.get_id()}")
            if len(user.get_rented_books()) == 0:
                print("Sin libros rentados")
            else:
                print("* Libros rentados *")
                for book in user.get_rented_books():
                    print(f"Titulo: {book.get_title()} Autor: {book.get_author()} ID: {book.get_id()}")

            if len(user.get_owned_books()) == 0:
                print("Sin libros comprados")
            else:
                print("* Libros comprados *")
                for book in user.get_owned_books():
                    print(f"Titulo: {book.get_title()} Autor: {book.get_author()} ID: {book.get_id()}")
