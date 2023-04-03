
public class EvenNumbers {
int num=10;
int num1;
int sum=0;
	public void forL(){
		for(int i=0;i<=num;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public void whileL(){
		int i =1;
		while(i<=num){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}	
	}
	
	
	public int nested(int num1){
		if(num1<12){
			nested(num+1);
		}
		else if(num1%2==0){
			return num1;
		}
		return -1;
		
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumbers n= new EvenNumbers();
		n.nested(1);
		//n.whileL();
		//n.forL();

	}

}
