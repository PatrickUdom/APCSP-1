import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        BankSecurity User1 = new BankSecurity(1234, 10000, false);
        User1.isAccountLocked();
    }
}

class BankSecurity {
    public int pin;
    public double accountBalance;
    public boolean accountLocked;
    public Scanner generalInput;

    // Constructor
    public BankSecurity(int pin, double accountBalance, boolean accountLocked) {
        this.pin = pin;
        this.accountBalance = accountBalance;
        this.accountLocked = accountLocked;
        this.generalInput = new Scanner(System.in);
    }

    // Method
    public void isAccountLocked() {
        if (this.accountLocked) {
            System.out.println("Account is locked. Access denied.");
        }
        else {
            System.out.println("Account is unlocked.");
            System.out.println("Input your PIN here:");
            int inputPIN = generalInput.nextInt();
            CorrectPin(inputPIN);
        }
    }

    // Add while loop so that user can retry pin
    public void CorrectPin(int inputPIN) {
        if (inputPIN == this.pin) {
            System.out.println("Correct PIN.");
            Menu();
        }
        else {
            System.out.println("Incorrect PIN.");
        }
    }

    public void Menu () {
        System.out.println("Would you like to:");
        System.out.println("1. Withdraw money (press 1)");
        System.out.println("2. Add money to balance (press 2)");
        int menuChoice = generalInput.nextInt();
        if (menuChoice == 1) {
            System.out.println("How much would you like to withdraw?:");
            double amountRequested = generalInput.nextDouble();
            WithdrawAccountBalance(amountRequested);
        }
        else {
            if (menuChoice == 2){
                System.out.println("How much would you like to add?:");
                double amountAdded = generalInput.nextDouble();
                AddAccountBalance(amountAdded);
            }
            else {
                System.out.println("Choice not found.");
            }
        }
    }

    public void WithdrawAccountBalance(double amountRequested) {
        if (this.accountBalance >= amountRequested) {
            System.out.println("You sucessfully withdrew.");
            this.accountBalance -= amountRequested;
            System.out.print("You have: ");
            System.out.print(this.accountBalance);
            System.out.println(" left.");
        }
        else {
            System.out.println("You do not have enough funds.");
        }
    }
    
    public void AddAccountBalance(double amountAdded) {
        this.accountBalance += amountAdded;
        System.out.print("You sucessfully added ");
        System.out.println(this.accountBalance);
        System.out.print("You have: ");
        System.out.print(this.accountBalance);
        System.out.println(" left.");
    }
}