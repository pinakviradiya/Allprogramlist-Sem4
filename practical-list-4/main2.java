class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: Rs. " + amount);
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal: Rs. " + amount);
        } else {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

public class main2 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        Account account = new Account(5000);

        try {
            account.deposit(5000);
            account.withdraw(2000);
            account.withdraw(1500);
            account.withdraw(3500); // This should throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final Balance: Rs. " + account.getBalance());
    }
}
