import java.util.Scanner;

	
public class SmallestandLargest {
	int arr[]=  new int[10];
	public void getData(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 10 number");
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
		}
	}
	
	public int smallest(){
		int min=arr[0];
		for(int i=1;i<10;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	
	
	public int greatest(){
		int max=arr[0];
		for(int i=1;i<10;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		SmallestandLargest s=new SmallestandLargest();
		s.getData();
		System.out.println(s.smallest());
		System.out.println(s.greatest());
	}
	

}
