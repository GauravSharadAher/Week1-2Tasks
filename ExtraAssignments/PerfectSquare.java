import java.util.Scanner;


public class PerfectSquare {

	int num;
	public void perfectS(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=in.nextInt();
		double temp;
		temp=Math.sqrt(num);
		int ans=(int)(temp);
		if(ans==temp){
			System.out.println("Given number is perfect square");
		}else{
			
	
		System.out.println("Given number Not a perfect Square");
	}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquare p = new PerfectSquare();
		p.perfectS();

	}

}
