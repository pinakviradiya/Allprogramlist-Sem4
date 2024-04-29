public class AccountP8 {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public AccountP8(String depositorName, String accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
	    	
            System.out.println("Amount " + amount + " Rp deposited successfully.");
            if (this.balance < 1000) {
                System.out.println("Warning: Balance is below 1000 Rp.");
            }
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void displayInfo() {
        System.out.println("Name of Depositor: " + this.depositorName);

        System.out.println("Account Number: " + this.accountNumber);

        System.out.println("Account Type: " + this.accountType);

        System.out.println("Current Balance: " + this.balance + " Rp");
    }

    // Example Usage:
    public static void main(String[] args) {
        // Create an account
        AccountP8 myAccount = new AccountP8("Pinak" , "220130318014" , "saving" , 2000);
 
        // Display initial info
        myAccount.displayInfo();

        // Deposit some amount
        myAccount.deposit(500);

        // Display updated info
        myAccount.displayInfo();
    }
}