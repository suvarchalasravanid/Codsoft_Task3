import java.util.*;
class ATM{
    //initially balance is 10,000
    double balance = 10000;
    double checkbalance(){
        return balance;
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited");
        System.out.println("Current Balance: "+checkbalance());
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("Amount withdraw successful");
            System.out.println("Current Balance: "+checkbalance());
        }
        else{
            System.out.println("Current Balance: "+checkbalance());
            System.out.println("No sufficient money to withdraw");
        }
    }
}
class User{
    public static void main(String[] args){
        ATM u = new ATM();
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;
        do {
            System.out.println("\nMain menu");
            System.out.println("0 - Exit");
            System.out.println("1 - Withdraw");
            System.out.println("2 - Deposit");
            System.out.println("3 - Check Balance");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 0 -> System.out.println("Thank you for visiting!");
                case 1 -> {
                    System.out.println("Amount to be withdrew: ");
                    amount = sc.nextDouble();
                    u.withdraw(amount);
                }
                case 2 -> {
                    System.out.println("Amount to be deposited: ");
                    amount = sc.nextDouble();
                    u.deposit(amount);
                }
                case 3 -> System.out.println(u.checkbalance());
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);
    }
}
