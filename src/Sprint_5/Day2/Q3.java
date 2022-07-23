package Sprint_5.Day2;

import java.util.Scanner;

class InsufficientFundException extends Exception{
    @Override
    public String getMessage() {
        return "Insufficient balance in the account";
    }
}

class Account{
    String accountNumber;
    double balance;
     void deposit(String acNumber, double amt){
         accountNumber = acNumber;
         balance += amt;
         System.out.println("Balance in the account no: "+accountNumber+" is => "+balance);
     }
     double withdraw(double bal, double amt) throws InsufficientFundException{
         balance = bal;
         if (balance<amt){
             throw new InsufficientFundException();
         }
         balance = balance-amt;
         return balance;
     }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account no: ");
        String ac = sc.next();
        System.out.println("Enter the amount you want to deposit");
        double bal = sc.nextDouble();
        System.out.println("Enter the amt you want to withdraw");
        double aw = sc.nextDouble();
        try{
            Account account = new Account();
            account.deposit(ac,bal);
            double balance = account.withdraw(bal,aw);
            System.out.println("Balance after withdraw: "+balance);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
