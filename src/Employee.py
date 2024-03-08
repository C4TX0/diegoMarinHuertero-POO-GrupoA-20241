from Bank import Bank
from BankAccount import BankAccount
class Employee:
    __name = ""
    __last_name = ""
    __account = BankAccount
    def __init__(self, name, last_name, account_number, type_of_account):
        if type_of_account != "A" and type_of_account != "B" and type_of_account != "C":
            print("ADVERTENCIA: Tipo de cuenta inválido. Debe ser 'A', 'B' o 'C'. No se pudo crear la cuenta.")
            return
        self.__accounts = []
        self.bank = Bank()
        self.__account = BankAccount(account_number,type_of_account)
        self.__accounts.append(self.__account)
        self.bank.add_employee(self)
        self.__name = name
        self.__last_name = last_name
        print("Usuario registrado correctamente.")

    def get_name(self):
        return self.__name

    def get_last_name(self):
        return self.__last_name

    def add_account(self, account_number, type_of_account):
        if type_of_account != "A" and type_of_account != "B" and type_of_account != "C":
            print("ADVERTENCIA: Tipo de cuenta invalido. Debe ser 'A', 'B' o 'C'. No se pudo crear la cuenta.")
            return
        self.__account = BankAccount(account_number,type_of_account)
        self.__accounts.append(self.__account)

    def print_accounts(self):
        for account in self.__accounts:
            print("Numero de cuenta: {}, Saldo: ${}, Tipo de cuenta: {}".format(account.get_account_number(), account.get_amount(), account.get_type()))

    def print_account(self, index):
        for account in self.__accounts:
            print("Numero de cuenta: {}, Saldo: ${}, Tipo de cuenta: {}".format(self.__accounts[index].get_account_number(), self.__accounts[index].get_amount(), self.__accounts[index].get_type()))

    def get_accounts(self):
        return self.__accounts
