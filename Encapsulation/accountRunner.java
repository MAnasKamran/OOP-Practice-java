package Lab3;

class Account {
        private double balance;
        public Account(){
             balance = 0.0;
        }
        public Account(double balance){
            this.balance = balance;
        }
        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            double balanceBefore = balance;
            if(amount > 0){
                balance += amount;
            }
            System.out.println("                         ");
            System.out.println("Balance before deposit: $" + balanceBefore);
            System.out.println("Amount deposited: $" + amount);
            System.out.println("Balance after deposit: $" + balance);
            System.out.println("                         ");
        }
        public void withdraw(double amount){
            double balanceBefore = balance;
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
            System.out.println("                         ");
        }
        public void Display(){
            System.out.println("                         ");
            System.out.println("Balance: $" + balance);
        }
}
public class accountRunner {
    public static void main(String [] args){
        Account acc1 = new Account(1000.0);
        Account acc2 = new Account(acc1.getBalance());
        acc1.deposit(50.5);
        acc1.withdraw(250.5);
        acc2.deposit(100.0);
        System.out.println("Final Account Balances: ");
        System.out.println("Balance of Account1: $" + acc1.getBalance());
        System.out.println("Balance of Account2: $" + acc2.getBalance());
    }
}
