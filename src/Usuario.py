import random


class User:
    __id = 0
    __name = ""
    __age = 0

    def __init__(self, name, age):
        self.__id = random.randint(1, 1000)
        self.__name = name
        self.__age = age
        self.__rented_books = []
        self.__owned_books = []

    def get_name(self):
        return self.__name

    def get_age(self):
        return self.__age

    def get_rented_books(self):
        return self.__owned_books

    def get_owned_books(self):
        return self.__rented_books

    def get_id(self):
        return self.__id
