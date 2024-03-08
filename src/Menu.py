from Bank import Bank
from Employee import Employee

class Menu:
    o = "x"
    index = 0
    bank = Bank()

    def main_menu(self):
        while True:
            print("Que accion desea realizar: \n[A] Registrarse \n[B] Acceder \n[C] Mostrar status de todos los usuarios \n[S] Salir")
            o = input().upper()
            if o == 'A':
                self.__register__(),
            elif o == 'B':
                if not self.__log_in__():
                    print("Cancelando"),
            elif o == 'C':
                if len(self.bank.get_employees()) == 0:
                    print("Sin usuarios registrados")
                else:
                    self.bank.print_all_employees()
            elif o == 'S':
                    break
            else:
                print("Opcion invalida")

    def __register__(self):
        name = input("Ingrese su nombre: ")
        last_name = input("Ingrese su apellido: ")
        type = input("Ingrese su tipo de cuenta: ")
        Employee(name,last_name,self.bank.generate_number(),type)


    def __log_in__(self):
        if len(self.bank.get_employees()) == 0:
            print("Sin usuarios registrados")
            return False
        i = 0
        for employee in self.bank.get_employees():
            print("[{}] {} {}".format(i,employee.get_name(),employee.get_last_name()))
            i+=1
        user =  int(input())
        if user >= len(self.bank.get_employees()) or user < 0:
            print("Usuario inexistente")
            return False
        self.__user_menu__(user)
        o = "x"
        return True

    def __user_menu__(self, index):
        while True:
            print("Que accion desea realizar: \n[A] Seleccionar Cuenta \n[B] Mostrar cuentas \n[C] Agregar Cuenta \n[S] Cerrar sesion")
            o = input().upper()
            if o == 'A':
                i = 0
                for account in self.bank.get_employees()[index].get_accounts():
                    print("[{}] Numero: {} Tipo: {} \n".format(i,account.get_account_number(),account.get_type()))
                account = int(input())
                if account >= len(self.bank.get_employees()[index].get_accounts()) or account < 0:
                    print("Cuenta inexistente")
                else:
                    self.__account_menu__(account)
                    o = "x"
            elif o == 'B':
                self.bank.get_employees()[index].print_accounts()
            elif o == 'C':
                print("Ingrese su tipo de cuenta: ")
                type = input()
                self.bank.get_employees()[index].add_account(self.bank.generate_number(),type)
            elif o == 'S':
                break
            else:
                print("Opcion invalida")

        print("Cerrando sesion")

    def __account_menu__(self, account):
        amount = 0
        while True:
            print("Que accion desea realizar: \n[A] Ingresar Dinero \n[B] Retirar Dinero \n[C] Mostrar Status \n[S] Salir\n")
            o = input().upper()
            if o == 'A':
                print("Cantidad que desea ingresar: ")
                amount = int(input())
                self.bank.get_employees()[self.index].get_accounts()[account].add_money(amount)
            elif o == 'B':
                print("Cantidad que desea retirar: ")
                amount = int(input())
                self.bank.get_employees()[self.index].get_accounts()[account].remove_money(amount)
            elif o == 'C':
                self.bank.get_employees()[self.index].print_account(account)
            elif o == 'S':
                break
            else:
                print("Opcion invalida")
