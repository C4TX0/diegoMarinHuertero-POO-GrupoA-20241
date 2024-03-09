import random


class Book:
    __id = 0
    __title = ""
    __author = ""
    __available = True

    def __init__(self, title, author):
        self.__id = random.randint(1, 1000)
        self.__title = title
        self.__author = author

    def get_title(self):
        return self.__title

    def get_author(self):
        return self.__author

    def get_id(self):
        return self.__id

    def get_status(self):
        return self.__available

    def set_status(self, status):
        self.__available = status
