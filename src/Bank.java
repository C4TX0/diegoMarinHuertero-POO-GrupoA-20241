import java.util.ArrayList;
import java.util.Random;

public class Bank {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static void printAllEmployees(){
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("Empleado: %s %s\n",
                    employees.get(i).getName(), employees.get(i).getLastName());
            employees.get(i).printAccounts();
        }

    }

    public static long generateNumber() {
        Random ran = new Random();
        boolean band = true;
        long num = 0;

        while (band) {
            num = ran.nextLong(89999) + 10000;
            band = false;

            for (int i = 0; i < employees.size(); i++) {
                for (int j = 0; j < employees.get(i).getAccounts().size(); j++) {
                    if (employees.get(i).getAccounts().get(j).getAccountNumber() == num) {
                        band = true;
                        break;
                    }
                }
                if (band) {
                    break;
                }
            }
        }
        return num;
    }
    public static ArrayList<Employee> getEmployees() { return employees; }
}
