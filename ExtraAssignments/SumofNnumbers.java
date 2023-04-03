import java.util.Scanner;


public class SumofNnumbers {
	int n;
	public int sumF()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=in.nextInt();
		int sum =0;
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}
	
	public int whileL(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=in.nextInt();
		int sum =0;
		while(n>0){
			sum+=n;
			n--;
		}
		return sum;
	}
	
	public int forE(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=in.nextInt();
		int arr[]=new int[n];
		for(int i=1; i<=n; i++){
			arr[i-1]=i;
		}
		int sum =0;
		for (int m :arr){
			sum+=m;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args){
		SumofNnumbers s =new SumofNnumbers();
		//System.out.println(s.sumF());
		//System.out.println(s.whileL());
		System.out.println(s.forE());

	}
}
