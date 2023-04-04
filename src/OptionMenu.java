import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends AccountType {
    Scanner input = new Scanner(System.in);

    String uName;
    int pNumber;
    HashMap <String, Integer> userData = new HashMap<>();

    public void LogIn() throws IOException{
            userData.put("ammara", 1234);
            userData.put("haroon", 3456);

            System.out.println("***--Welcome to the ATM--***");
            System.out.print("Enter UserName: ");
            uName = input.nextLine();
            System.out.print("Enter Your 4 digit Pin: ");
            pNumber = input.nextInt();
            if (pNumber > 999)
            {
                if (userData.containsKey(uName) && userData.get(uName) == pNumber){
                    getAccountType();
                }
                else {
                    System.out.println("UserName OR PinNumber is Wrong.");
                }
            }
            else {
                System.out.println("Pin Number must be 4 digit");
            }

    }

    public void getAccountType(){
        System.out.println("***--Choose Your Account Type.--***");
        System.out.println("Press 1: Current Account.");
        System.out.println("Press 2: Saving Account");
        System.out.println("Press 3: Exit");
        System.out.print("Choose: ");

        int selection = input.nextInt();
        switch (selection) {
            case 1 -> getCurrentAccount();
            case 2 -> getSavingAccount();
            case 3 -> {
                System.out.println("Thank You... Come Again!! \n");
                System.exit(0);
            }
            default -> System.out.println("Invalid input \n");
        }
    }

    public void getCurrentAccount() {
        System.out.println("***--Welcome to the Current Account--***");
        System.out.println("Press 1: Check your balance.");
        System.out.println("Press 2: Withdraw Amount.");
        System.out.println("Press 3: Deposit Amount");
        System.out.println("Press 4: Exit");
        System.out.print("Choose: ");

        int select = input.nextInt();
        if (select == 1){
            System.out.println("Current Account Balance is : " +getCurrentBalance());
            getCurrentAccount();
        } else if (select == 2) {
            currentAccountWithDrawAmount();
            getCurrentAccount();
        } else if (select == 3) {
            currentAccountDepositAmount();
            getCurrentAccount();
        } else {
            //System.out.println("***Back to the Account Type***");
            getAccountType();
        }
    }

    public void getSavingAccount() {
        System.out.println("***--Welcome to the Saving Account--***");
        System.out.println("Press 1: Check your balance.");
        System.out.println("Press 2: Withdraw Amount.");
        System.out.println("Press 3: Deposit Amount");
        System.out.println("Press 4: Exit");
        System.out.print("Choose: ");
        int select = input.nextInt();
        if (select == 1){
            System.out.println("Saving Account Balance is : " +getSavingBalance());
            getSavingAccount();
        } else if (select == 2) {
            savingAccountWithDrawAmount();
            getSavingAccount();
        } else if (select == 3) {
            savingAccountDepositAmount();
            getSavingAccount();
        } else {
            //System.out.println("***Back to the Account Type***");
            getAccountType();
        }
    }
}
