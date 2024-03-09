class BookStore:
    __users = []
    __books = []

    def add_user(self, user):
        self.__users.append(user)

    def get_users(self):
        return self.__users

    def get_books(self):
        return self.__books

    def add_book(self, book):
        self.__books.append(book)

    def show_users(self):
        print("** USUARIOS **")
        for user in self.__users:
            print(f"\nNombre: {user.get_name()} Edad: {user.get_age()} ID: {user.get_id()}")
            if len(user.get_books_list()) == 0:
                print("Sin libros rentados")
            else:
                print("* Libros rentados *")
                for book in user.get_books_list():
                    print(f"Titulo: {book.get_title()} Autor: {book.get_author()} ID: {book.get_id()}")
