import java.util.ArrayList;

public class Employee {
    private String name;
    private String lastName;
    private BankAccount account;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Employee(String name, String lastName, long accountNumber, char typeOfAccount) {
        if(typeOfAccount != 'A' && typeOfAccount != 'B' && typeOfAccount != 'C'){
            System.out.println("ADVERTENCIA: Tipo de cuenta inválido. Debe ser 'A', 'B' o 'C'. No se pudo crear la cuenta.");
            return;
        }
        this.account = new BankAccount(accountNumber, typeOfAccount);
        accounts.add(this.account);
        Bank.addEmployee(this);
        this.name = name;
        this.lastName = lastName;
        System.out.println("Usuario registrado con exito");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public BankAccount getAccount(int index) { return accounts.get(index); }

    public void addAccount( long accountNumber, char typeOfAccount){
        if(typeOfAccount != 'A' && typeOfAccount != 'B' && typeOfAccount != 'C'){
            System.out.println("ADVERTENCIA: Tipo de cuenta inválido. Debe ser 'A', 'B' o 'C'. No se pudo crear la cuenta.");
            return;
        }
        this.account = new BankAccount(accountNumber, typeOfAccount);
        accounts.add(this.account);
    }

    public void printAccounts(){
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("Numero de cuenta: %d, Saldo: %.2f, Tipo de cuenta: %c.\n",accounts.get(i).getAccountNumber(),
                    accounts.get(i).getAmount(),accounts.get(i).getType());
        }
    }
    public void printAccount(int index){
        System.out.printf("Numero de cuenta: %d, Saldo: %.2f, Tipo de cuenta: %c.\n",accounts.get(index).getAccountNumber(),
                accounts.get(index).getAmount(),accounts.get(index).getType());

    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

}
