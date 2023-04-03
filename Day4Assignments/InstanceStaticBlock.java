
public class InstanceStaticBlock {
	static int count=0;
	
	static 
	{
		System.out.println("In Static block");
	}
	
	//instance
	{
		count++;

		System.out.print("In Instance block");
		System.out.println(" Instance block called " + count +" times");
	}
	
	public static void main(String[] args) {
		InstanceStaticBlock i =new InstanceStaticBlock();
		InstanceStaticBlock i2 = new InstanceStaticBlock();

	}

}
