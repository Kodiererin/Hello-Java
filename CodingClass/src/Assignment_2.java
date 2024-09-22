
public class Assignment_2 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(400);
        System.out.println("Current balance: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(600);
        savingsAccount.withdraw(500);
        System.out.println("Savings Account balance: " + savingsAccount.getBalance());
	}
}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class (subclass of BankAccount)
class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal not allowed.");
        }
    }
}
