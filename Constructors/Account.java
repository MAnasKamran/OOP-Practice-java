// Demonstrates use of non-parameterized and parameterized constructors
// along with basic account operations

public class Account {
    int balance;
    int accountNumber;
    public Account(){
        this.balance = balance;
        accountNumber = 0;
    }
    public Account(int balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount){
        int balanceBefore = balance;
        if(amount > 0){
            balance += amount;
        }
        System.out.println("                         ");
        System.out.println("Balance before deposit: $" + balanceBefore);
        System.out.println("Amount deposited: $" + amount);
        System.out.println("Balance after deposit: $" + balance);
    }
    public void withdraw(int amount){
        int balanceBefore = balance;
        if(balance >= amount && amount > 0){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds or invalid amount!");
        }
        System.out.println("                         ");
        System.out.println("Balance before withdraw: $" + balanceBefore);
        System.out.println("Amount withdrawn: $" + amount);
        System.out.println("Balance after withdraw: $" + balance);
    }
    public void Display(){
        System.out.println("                         ");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public static void main(String [] args){
        Account acc1 = new Account();
        acc1.balance = 100;
        acc1.deposit(50);
        acc1.Display();
        acc1.withdraw(10);
        acc1.Display();
        System.out.println("                         ");
        System.out.println("                         ");
        Account acc2 = new Account(500, 60);
        acc2.Display();
        acc2.deposit(100);
        acc2.withdraw(300);
        acc2.Display();
        Account acc3 = new Account(1000, 9854);
        acc3.Display();
        acc3.withdraw(250);
        acc3.Display();
    }
}

