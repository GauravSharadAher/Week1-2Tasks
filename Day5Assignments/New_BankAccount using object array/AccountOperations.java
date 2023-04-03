package New_BankAccount;

import java.util.Scanner;

public class AccountOperations {

    static int i=0;
    public AccountOperations() {

    }

    public static void createAccount(Account [] arr){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter 4 digit pin for account:");
        int pin =in.nextInt();
        arr[i]=new Account(name,pin);
        i++;
        System.out.println("Account created successfully!!!\n\n");

    }

    public static void displayAccounts(Account a[]) {
        for(int i = 0 ; i <a.length ; i++) {

            System.out.println(a[i].showData());

        }
    }
    public static int searchAccount (Account a[] , int temp) {

        for(int i = 0 ; i <a.length ; i++) {
            if(a[i].accId == temp) {
        System.out.println(a[i].showData());
                return i;
            }
        }
        return -1;
    }

    public static void deposit(Account a[],int accID,float deposit){
         int temp1 =searchAccount(a,accID);

             a[temp1].balance=a[temp1].balance+deposit;
             System.out.println(deposit+"  Money deposited sucessfully" + "Available balance" +a[temp1].balance);
         }

    public static void withdraw(Account a[],int accID,int pin,float withdraw){
        int temp1 =searchAccount(a,accID);
        if(a[temp1].pin==pin) {
            if (a[temp1].balance > 0 && a[temp1].balance >=withdraw) {
                a[temp1].balance = a[temp1].balance - withdraw;
                System.out.println(withdraw + " Money withdrawn sucessfully" + "Available balance " + a[temp1].balance);
            } else {
                System.out.println("Insufficient funds \n Please deposit money \n Available balance= " + a[temp1].balance);
            }
        }
        else {
            System.out.println("Invalid pin");
        }

    }

    public static void checkBalance(Account a[],int accID,int pin) {
        int temp1 = searchAccount(a, accID);
        System.out.println(a[temp1].balance);
    }


    public static void changeiRate(float num){
        Account.iRate= num;
    }

    public static void interest(Account arr[], int accId, int pin){
        int temp1 =searchAccount(arr,accId);
        if(arr[temp1].pin==pin) {
            float amount = (arr[temp1].balance * Account.iRate * 0.083f);
            System.out.println("Interset for 30 days = "+ amount);
        }
        else{
            System.out.println("Invalid pin entered");}
    }

    }
