import java.util.Scanner;

public class ch_08_12

    /*Add a toString method to the BankAccount class from the previous exercise. Your method should return a string that
        contains the account's name and balance separated by a comma and space. For example, if an account object named
        yana has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03".
        */
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount("kurt", 100,1.20);
        ba.withdraw(0);
    }
    public static class BankAccount {
        Scanner sc = new Scanner(System.in);
        String name;
        double balance = 100;
        double transactionFee = 0.00;

        public void  deposit(double amount) {
            balance = balance + amount;
        }


        public void withdraw(double amount){
            System.out.println("How much do you want to withdraw?");
            amount = sc.nextDouble();
            System.out.println("Enter transaction fee");
            transactionFee = sc.nextDouble();
            balance = balance - amount - transactionFee;

            if (balance < 0){
                System.out.println("Your account cant go below 0");
                balance = balance + amount + transactionFee;

            }
            else
                System.out.println("you have withdrawn: " + amount);
        }

        public BankAccount(String name, double balance, double transactionFee)
        {
            this.name = name;
            this.balance = balance;
            this.transactionFee = transactionFee;
        }
        public String toString() {
            return name + ", " + balance;
        }
    }
}
