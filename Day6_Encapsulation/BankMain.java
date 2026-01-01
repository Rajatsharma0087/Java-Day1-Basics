package Day6_Encapsulation;

public class BankMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}
