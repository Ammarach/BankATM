import java.util.Scanner;

public class AccountType {
    private String userName;
    private int pinNumber;
    private double currentBalance = 0.0;
    private double savingBalance = 0.0;

    Scanner input = new Scanner(System.in);

    public String setUserName(String uName) {
        this.userName = uName;
        return userName;
    }
    public String getUserName() {
        return userName;
    }

    public int setPinNumber(int pNumber) {
        this.pinNumber = pNumber;
        return pinNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }

    public double currentAccountWithDraw (double amount) {
        currentBalance = currentBalance - amount;
        return currentBalance;
    }
    public double savingAccountWithDraw (double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;
    }
    public double currentAccountDeposit (double amount) {
        currentBalance = currentBalance + amount;
        return currentBalance;
    }
    public double savingAccountDeposit (double amount) {
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    public void currentAccountWithDrawAmount () {
        System.out.println("Current Account Balance: " +getCurrentBalance());
        System.out.print("Enter amount to withDraw from the Current Account: ");
        double amount = input.nextDouble();
        if (currentBalance - amount >= 0) {
            currentAccountWithDraw(amount);
            System.out.println("New Current Account Balance : " +currentBalance);
        }
        else {
            System.out.println("\n You Balance is Low :( \n");
        }
    }

    public void savingAccountWithDrawAmount () {
        System.out.println("Saving Account Balance: " +getSavingBalance());
        System.out.print("Enter amount to withDraw from the Saving Account: ");
        double amount = input.nextDouble();
        if (savingBalance - amount >= 0) {
            savingAccountWithDraw(amount);
            System.out.println("New Saving Account Balance : " +currentBalance);
        }
        else {
            System.out.println("\n You Balance is Low :( \n");
        }
    }

    public void currentAccountDepositAmount() {
        System.out.println("Current Account Balance: " +getCurrentBalance());
        System.out.println("Enter Amount to Deposit: ");
        double amount = input.nextDouble();
        if (currentBalance + amount >= 0)
        {
            currentAccountDeposit(amount);
            System.out.println("New Current Account Balance is: " +currentBalance);
        }
    }

    public void savingAccountDepositAmount() {
        System.out.println("Saving Account Balance: " +getSavingBalance());
        System.out.println("Enter Amount to Deposit: ");
        double amount = input.nextDouble();
        if (savingBalance + amount >= 0)
        {
            savingAccountDeposit(amount);
            System.out.println("New Current Account Balance is: " +currentBalance);
        }
    }

}
