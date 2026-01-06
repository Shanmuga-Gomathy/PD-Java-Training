class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public void withDraw(double amount){
        if (amount > 0 && amount < balance){
            balance -= amount;
        }
        else{
            System.out.println("Unable to Withdraw");
        }
    }
    public double checkBalance(){
        return balance;
    }
}
public class Encapsulation2 {
    public static void main (String[] args){
        BankAccount account = new BankAccount(2000);
        account.deposit(400);
        account.withDraw(234.56);
        System.out.print("Balance Amount is: " +account.checkBalance());
    }
}
