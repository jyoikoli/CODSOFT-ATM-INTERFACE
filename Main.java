package AtmInterface;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance of 1000
        Atm atm = new Atm(userAccount);
        atm.displayMenu();
    }
}
