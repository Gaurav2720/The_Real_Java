interface Transaction {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Account implements Transaction {
    private int accountNumber;
    private String accountHolder;
    protected double balance;
    Account() {
        accountNumber = 0;
        accountHolder = "N/A";
        balance = 0.0;
        System.out.println("  [Constructor 1] No-arg Account created.");
    }
    Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        System.out.println("  [Constructor 2] Account created with number and name.");
    }
    Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        System.out.println("  [Constructor 3] Full Account created.");
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("  [Error] Amount must be greater than 0.");
            return;
        }
        balance += amount;
        System.out.println("  Deposited Rs." + amount + " | New Balance: Rs." + balance);
    }
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("  [Error] Amount must be greater than 0.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available: Rs." + balance + " | Requested: Rs." + amount
            );
        }
        balance -= amount;
        System.out.println("  Withdrawn Rs." + amount + " | Remaining: Rs." + balance);
    }
    public double calculateInterest() {
        return 0.0;
    }
    public void displayInfo() {
        System.out.println("  Account No  : " + accountNumber);
        System.out.println("  Holder Name : " + accountHolder);
        System.out.println("  Balance     : Rs." + balance);
    }
    public void displayInfo(String label) {
        System.out.println("  ---- " + label + " ----");
        displayInfo();
    }
    public int getAccountNumber()    { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance()       { return balance; }
}
class SavingsAccount extends Account {
    private double interestRate;
    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
        System.out.println("  [SavingsAccount created] Rate: " + interestRate + "%");
    }
    @Override
    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Interest Rate : " + interestRate + "%");
        System.out.println("  Interest Amt  : Rs." + calculateInterest());
    }
}
public class BankManagementSystem {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("         BANK MANAGEMENT SYSTEM             ");
        System.out.println("============================================");
        System.out.println("\n>> 1. Constructor Overloading:");
        Account a1 = new Account();
        Account a2 = new Account(101, "Ravi Kumar");
        Account a3 = new Account(102, "Priya Sharma", 8000);
        System.out.println("\n>> 2. Method Overloading - displayInfo():");
        a3.displayInfo();
        System.out.println();
        a3.displayInfo("Priya's Account");
        System.out.println("\n>> 3. Deposit:");
        a3.deposit(2000);
        System.out.println("\n>> 4. Withdraw (Success):");
        try {
            a3.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("  [Exception] " + e.getMessage());
        }
        System.out.println("\n>> 5. Withdraw - Insufficient Balance:");
        try {
            a3.withdraw(50000);
        } catch (InsufficientBalanceException e) {
            System.out.println("  [Exception Caught] " + e.getMessage());
        }
        System.out.println("\n>> 6. Creating SavingsAccount:");
        SavingsAccount sa = new SavingsAccount(201, "Amit Singh", 15000, 5.0);
        System.out.println("\n>> 7. @Override calculateInterest():");
        System.out.println("  Interest Earned: Rs." + sa.calculateInterest());
        System.out.println("\n>> 8. Deposit in SavingsAccount:");
        sa.deposit(5000);
        System.out.println("\n>> 9. Withdraw from SavingsAccount:");
        try {
            sa.withdraw(4000);
        } catch (InsufficientBalanceException e) {
            System.out.println("  [Exception] " + e.getMessage());
        }
        System.out.println("\n>> 10. @Override displayInfo() in SavingsAccount:");
        sa.displayInfo("Amit's Savings Account");
        System.out.println("\n>> 11. Ravi's Account:");
        a2.deposit(3000);
        a2.displayInfo();
        System.out.println("\n============================================");
        System.out.println("          Program Completed!                ");
        System.out.println("============================================");
    }
}