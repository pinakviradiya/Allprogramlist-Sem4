public class Account 
{
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String depositorName, String accountNumber, String accountType, double balance) 
{
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public Account(Account other) 
{
        this.depositorName = other.depositorName;
        this.accountNumber = other.accountNumber;
        this.accountType = other.accountType;
        this.balance = other.balance;
    }

    public void displayAccountDetails()
 {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) 
{
 
        Account account1 = new Account("Pinak", "123456789", "Savings", 1000.00);
        System.out.println("Account 1 Details:");
        account1.displayAccountDetails();
        Account account2 = new Account(account1);
        System.out.println("\nAccount 2 Details (Copy of Account 1):");
        account2.displayAccountDetails();
    }
}
