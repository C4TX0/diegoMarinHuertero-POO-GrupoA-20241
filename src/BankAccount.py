class BankAccount:
    __account_number = 0
    __amount = 0
    __type = ""

    def __init__(self, account_number, type):
        self.__account_number = account_number
        self.__type = type

    def get_account_number(self):
        return self.__account_number

    def get_amount(self):
        return self.__amount

    def add_money(self, amount):
        if self.__type == "A":
            self.add_moneyA(amount)
        elif self.__type == "B":
            self.add_moneyB(amount)
        else:
            self.add_moneyC(amount)


    def add_moneyA(self, amount):
        if self.__amount + amount > 50000:
            print("No puede tener más de 50,000 en cuenta A")
        elif self.__amount + amount < 1000:
            print("No puede tener menos de 1,000 en cuenta A")
        else:
            self.__amount += amount

    def add_moneyB(self, amount):
        if self.__amount + amount > 50000:
            print("No puede tener más de 100,000 en cuenta B")
        elif self.__amount + amount < 1000:
            print("No puede tener menos de 5,000 en cuenta B")
        else:
            self.__amount += amount

    def add_moneyC(self, amount):
        if self.__amount + amount < 10000:
            print("No puede tener menos de 10,000 en cuenta C")
        else:
            self.__amount += amount

    def remove_money(self, amount):
        if self.__type == "A":
            self.remove_moneyA(amount)
        elif self.__type == "B":
            self.remove_moneyB(amount)
        else:
            self.remove_moneyC(amount)
    def remove_moneyA(self, amount):
        if self.__amount - amount >= 1000:
             self.__amount -= amount
        else:
             print("No puede tener menos de 1,000 cuenta A")

    def remove_moneyB(self, amount):
        if self.__amount - amount >= 5000:
             self.__amount -= amount
        else:
             print("No puede tener menos de 5,000 cuenta B")

    def remove_moneyB(self, amount):
        if self.__amount - amount >= 10000:
             self.__amount -= amount
        else:
             print("No puede tener menos de 10,000 cuenta C")

    def get_type(self):
        return self.__type






