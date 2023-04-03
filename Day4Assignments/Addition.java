
public class Addition {

//	public String add(int...n){
//		int sum=0;
//		for(int i=0;i<n.length; i++){
//			sum+=n[i];
//		}
//		return n.length+" numbers is "+ sum;
//	}
	
	public String add2(int...n){
		int sum=0;
		int count=0;
		for(int x :n){
			sum+=x;
			count++;
			
		}
		return count+" numbers is "+ sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a= new Addition();
		System.out.println("Addition of "+a.add2(10,20,20,30) );

	}

}
