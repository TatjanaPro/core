package w3resource;

public class BankAccount {
    private int balance;

    public BankAccount (int balance) {
        this.balance = balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Not enough money");
        }
    }
    public int getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount (int balance) {
        super(balance);
    }
    @Override
    public void withdraw(int amount) {
        if(getBalance() - amount < 100) {
            System.out.println("Fail. Balance cant be less than 100");
        }
        else {
            super.withdraw(amount);
        }
    }
}
class Main5 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(300);
        System.out.println("Deposit 100");
        bankAccount.deposit(100);
        System.out.println("Balance is " + bankAccount.getBalance());
        System.out.println("Withdraw 350");
        bankAccount.withdraw(350);
        System.out.println("Balance " + bankAccount.getBalance());
        System.out.println("Withdraw 200");
        bankAccount.withdraw(200);
        System.out.println("Balance " + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(100);
        System.out.println("Deposit 50");
        savingsAccount.deposit(50);
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Withdraw 160");
        savingsAccount.withdraw(160);
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Withdraw 60");
        savingsAccount.withdraw(60);
        System.out.println("Balance: " + savingsAccount.getBalance());
        System.out.println("Withdraw 30");
        savingsAccount.withdraw(30);
        System.out.println("Balance: " + savingsAccount.getBalance());
    }
}