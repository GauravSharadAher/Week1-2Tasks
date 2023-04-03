package New_BankAccount;

import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int input;
       int i=0;
        int accId,pin;
        float amount;
        System.out.println("Enter the number of customers :");
       // int size = in.nextInt();
        Account arr[] = new Account[2];

        while(true){
            System.out.println("\n\nWelcome To the bank ");
            System.out.println("1. Create Account");
            System.out.println("2. To display Information of Account ");
            System.out.println("3. To deposit ");
            System.out.println("4. To withdraw ");
            System.out.println("5. To check balance ");
            System.out.println("6. To change Interest rate");
            System.out.println("7. To calculate interest for 30 days");
            System.out.println("8. To exit");
            System.out.println();
            System.out.println();
            System.out.println("Enter the number to perform action");
            input = in.nextInt();
            switch (input){
                case 1:
                    AccountOperations.createAccount(arr);

                    break;

                case 2:

                    System.out.println("Enter accID");
                    int amount1=in.nextInt();
                    AccountOperations.searchAccount(arr,amount1);
                    break;
                case 3:

                    System.out.println("Enter the accId");
                    accId=in.nextInt();
                    System.out.println("Enter the amount to be deposited");
                    amount= in.nextFloat();
                    AccountOperations.deposit(arr,accId,amount);
                    break;
                case 4:
                    System.out.println("Enter the accId");
                    accId=in.nextInt();
                    System.out.println("Enter the account pin");
                    pin=in.nextInt();
                    System.out.println("Enter the amount to be withdraw");
                    amount= in.nextFloat();
                    AccountOperations.withdraw(arr,accId, pin,amount);
                    break;


                case 5:
                    System.out.println("Enter the Account no: ");
                    accId=in.nextInt();
                    System.out.println("Enter the 4 digit pin: ");
                    pin=in.nextInt();
                    AccountOperations.checkBalance(arr, accId, pin);
                    break;

                case 6:
                    System.out.println("Enter the new Interest Rate");
                    amount=in.nextFloat();
                    AccountOperations.changeiRate(amount);
                    break;

                case 7:
                    System.out.println("Enter the account no and pin");
                    accId=in.nextInt();
                    pin=in.nextInt();
                    AccountOperations.interest(arr,accId,pin);

                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;

            }


        }
    }
}
