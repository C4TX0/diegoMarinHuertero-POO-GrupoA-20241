import random

class Bank:

    __employees = []

    def add_employee(self, employee):
        self.__employees.append(employee)


    def print_all_employees(self):
        for employee in self.__employees:
            print("Empleado: {} {}".format(employee.get_name(),employee.get_last_name()))
            employee.print_accounts()

    def generate_number(self):
        band = True
        num = 0
        while band:
            num = random.randint(10000,99999)
            band = False
            for employee in self.__employees:
                for account in employee.get_accounts():
                    if account.get_account_number() == num:
                        band = True
                        break
                if band:
                    break
        return num

    def get_employees(self):
        return self.__employees