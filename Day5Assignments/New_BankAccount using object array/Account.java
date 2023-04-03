package New_BankAccount;

public class Account {
    String name;
    int accId;
    float balance;
    int pin;

    static float iRate;

static int count ;
    public Account(String name,int pin) {
         count += 1;
        accId=count;
        this.pin=pin;
        this.name = name;
        this.balance=0;
    }

    public Account(){

    }

    public String showData(){
       return "Account number : " + accId + "\nName :" + name + "\nAccount Balance = " + balance ;
    }

}
