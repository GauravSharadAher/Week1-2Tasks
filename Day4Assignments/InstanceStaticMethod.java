
public class InstanceStaticMethod {
	
	int i=0;
public static void stat(){
	
	System.out.println("In Static method");
}
public void insta(){
	System.out.println("In Instance method");
}
public static void main(String []args){
	InstanceStaticMethod i= new InstanceStaticMethod ();
	i.insta();
	i.stat();
	
}
	}