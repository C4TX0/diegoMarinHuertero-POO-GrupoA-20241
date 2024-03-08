import java.util.Scanner;

public class Menu {
    private static Scanner read = new Scanner(System.in);
    static char o;
    static int index;
    public static void mainMenu(){
        do {
            System.out.println("Que accion desea realizar: \n[A] Registrarse \n[B] Acceder \n[C] Mostrar status de todos los usuarios \n[S] Salir");
            o = read.next().charAt(0);
            switch (o){
                case 'A' :
                    register();
                    break;
                case 'B':
                    if (!logIn()){
                        System.out.println("Cancelando");
                    }
                    break;
                case 'C':
                    if(Bank.getEmployees().isEmpty()){
                        System.out.println("Sin ususarios registrados");
                        break;
                    }
                    Bank.printAllEmployees();
                    break;
            }
        }while(o != 'S');
    }

    private static void register(){
        System.out.println("Ingrese su Nombre: ");
        String name = read.next();

        System.out.println("Ingrese su Apellido: ");
        String lastName = read.next();

        System.out.println("Ingrese su tipo de cuenta: ");
        char type = read.next().charAt(0);

        new Employee(name,lastName, Bank.generateNumber(),type);
    }

    private static boolean logIn(){
        if (Bank.getEmployees().isEmpty()) {
            System.out.println("Sin usuarios registrados");
            return false;
        }
        for (int i = 0; i < Bank.getEmployees().size(); i++) {
            System.out.printf("[%d] %s %s \n", i, Bank.getEmployees().get(i).getName(), Bank.getEmployees().get(i).getName());
        }
        int user = read.nextInt();
        if(user >= Bank.getEmployees().size() || user < 0){
            System.out.println("Usuario inexistente");
            return false;
        }
        userMenu(user);
        o = 'x';
        return true;
    }

    private static void userMenu(int index){
        do {
            System.out.println("Que accion desea realizar: \n[A] Seleccionar Cuenta \n[B] Mostrar cuentas \n[C] Agregar Cuenta \n[S] Cerrar sesion");
            o = read.next().charAt(0);
            switch (o){
                case 'A':
                    for (int i = 0; i < Bank.getEmployees().get(index).getAccounts().size(); i++) {
                        System.out.printf("[%d] Numero: %s Tipo: %c \n", i,
                                Bank.getEmployees().get(index).getAccount(i).getAccountNumber(),
                                Bank.getEmployees().get(index).getAccount(i).getType());
                    }
                    int account = read.nextInt();
                    if(account >= Bank.getEmployees().get(index).getAccounts().size() || account < 0){
                        System.out.println("Cuenta inexistente");
                        break;
                    }
                    accountMenu(account);
                    o = 'x';
                    break;
                case 'B':
                    Bank.getEmployees().get(index).printAccounts();
                    break;
                case 'C':
                    System.out.println("Ingrese su tipo de cuenta: ");
                    char type = read.next().charAt(0);

                    Bank.getEmployees().get(index).addAccount(Bank.generateNumber(),type);
                    break;
            }

        }while(o != 'S');
        System.out.println("Cerrando sesion");
    }

    private static void accountMenu(int account){
        double amount;
        do {
            System.out.println("Que accion desea realizar: \n[A] Ingresar Dinero \n[B] Retirar Dinero \n[C] Mostrar Status \n[S] Salir\n");
            o = read.next().charAt(0);
            switch (o){
                case 'A':
                    System.out.println("Cantidad que desea ingresar: ");
                    amount = read.nextInt();
                    Bank.getEmployees().get(index).getAccount(account).addMoney(amount);
                    break;
                case 'B':
                    System.out.println("Cantidad que desea retirar: ");
                    amount = read.nextInt();
                    Bank.getEmployees().get(index).getAccount(account).removeMoney(amount);
                    break;
                case 'C':
                    Bank.getEmployees().get(index).printAccount(account);
                    break;
            }

        }while(o != 'S');
    }
}
