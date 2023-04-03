import java.util.Scanner;


public class Gcd {
	
	
	public int getData(){
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2){
		for(int i=1; i<=num2;i++){
			if(num1%i==0&&num2%i==0){
			 temp=i;
			}
		}
		}
		else{
			for(int i=1; i<=num1;i++){
				if(num1%i==0&&num2%i==0){
				 temp=i;
				}
			}

		}
		return temp;
	} 
	public static void main(String[] args) {
		Gcd g= new Gcd();
		System.out.println(g.getData());

	}

}
