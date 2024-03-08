public class BankAccount {
    private long accountNumber;
    private double amount;
    private char type;

    public BankAccount(long accountNumber, char type) {
        this.type = type;
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void addMoney(double amount) {
        if (type == 'A') addMoneyA(amount);
        else if (type == 'B') addMoneyB(amount);
        else addMoneyC(amount);
    }
    private void addMoneyA(double amount) {
        if (this.amount + amount > 50000) {
            System.out.println("No puede tener más de 50,000 en cuenta A");
        }
        else if(this.amount + amount < 1000){
            System.out.println("No puede tener menos de 1,000 en cuenta A");
        }
        else {
            this.amount += amount;
        }
    }
    private void addMoneyB(double amount) {
        if (this.amount + amount > 100000) {
            System.out.println("No puede tener más de 100,000 en cuenta B");
        }
        else if(this.amount + amount < 5000){
            System.out.println("No puede tener menos de 1,000 en cuenta B");
        }
        else {
            this.amount += amount;
        }
    }

    private void addMoneyC(double amount) {
        if(this.amount + amount < 10000){
            System.out.println("No puede tener menos de 10,000 en cuenta C");
        }
        else {
            this.amount += amount;
        }
    }

    public void removeMoney(double amount){
        if (type == 'A'){ removeMoneyA(amount); }
        else if (type == 'B'){ removeMoneyB(amount); }
        else{ removeMoneyC(amount); }
    }
    private void removeMoneyA(double amount){
        if (this.amount - amount >= 1000){
            this.amount -= amount;
        }
        else{ System.out.println("No puede tener menos de 1,000 cuenta A"); }
    }
    private void removeMoneyB(double amount){
        if (this.amount - amount >= 5000){
            this.amount -= amount;
        }
        else{
            System.out.println("No puede tener menos de 5,000 cuenta B");
        }
    }
    private void removeMoneyC(double amount){
        if (this.amount - amount >= 10000){
            this.amount -= amount;
        }
        else{
            System.out.println("No puede tener menos de 10,000 cuenta C");
        }
    }
    public char getType() { return type; }

}
