import java.util.Scanner;


public class BankAccount {
	int accId , pincode ;  
	String name; 
	float balance;
	static float iRate;
	Scanner in = new Scanner(System.in);
	int count=100;
	{
		count=count+1;
		accId=count;
	}
	
	public BankAccount(int accId, int pincode, String name, float balance) {
		super();
		this.accId = accId;
		this.pincode = pincode;
		this.name = name;
		this.balance = balance;
	}
	
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}


	public void createAcc(){
		System.out.println("Enter name: ");
		 name= in.nextLine();
		System.out.println("Enter pincode:");
		pincode= in.nextInt();
		
	}
	
	public void display(){
		System.out.println("Enter the account number ");
		System.out.println("Account number is:"+ accId);
		System.out.println("Account holder name is:"+ name);
		System.out.println("Account holders pincode is:"+ pincode);
		System.out.println("Account balance is: " + balance);
	}
	
	               
   public void deposit(){
	   float depamount=0f;
	   System.out.println("Enter the amount to be deposited:");
	   depamount= in.nextFloat();
	   balance= balance+depamount;
	   System.out.println("Amount deposited successfully!!!");
	   System.out.println("Cuurent account balance is :"+ balance);
	   
   }
   
   public void withdraw(){
	   float withamount=0;
	   System.out.println("Enter the amount to withdrawl:");
	   withamount=in.nextFloat();
	   if(balance<withamount){
		   System.out.println("Insufficient balance \n Balance= "+ balance);
		   
	   }else{
	   balance= balance-withamount;
	   System.out.println("Amount withdrawal successfully!!");
	   System.out.println("Cuurent account balance is :"+ balance);
	   }
	   }
   
   public void inchnge(){
	   System.out.println("Enter the updated interest rate");
	   iRate= in.nextFloat();
   }

 public void checkBalance(){
	 System.out.println("Available balance is: "+ balance);
 }

 
 
 public void interest(){
	 float interest= ((balance*1/12*iRate)/100);
	 System.out.println("Interest for a 30 days:" +interest );
 } 
 
 

	
	
	
	

	
	public static void main(String[] args) {
		BankAccount b= new BankAccount();
		
		
//		BankAccount arr[]= new BankAccount[10];
		Scanner sc= new Scanner (System.in);
		int num;
		
		do{
			System.out.println("Welcome To the bank ");
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
			
	      
			switch(num= sc.nextInt()){
			
			case 1:BankAccount b1= new BankAccount();
			
				b1.createAcc();
				break;
				
			case 2: b.display();
					break;
			
			case 3: b.deposit();
					break;
			
			case 4: b.withdraw();
					break;
			case 5: b.checkBalance();
					break;
			case 6: b.inchnge();
					break;
			case 7: b.interest();
					break;
			case 8: break;
			
			default : System.out.println("Invalid input");
			
			}
			
			
			System.out.println();
			System.out.println();
			
		}while(num!=8);
	
	}

}
