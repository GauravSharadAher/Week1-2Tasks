
public class Student {
	

	  public void printData(String name, int...m ){
		  int sum=0;
		  for(int j=0;j<m.length;j++ ){
			  if(m[j]<0){
				  System.out.println("Invalid data entered");
				  return;
			  }
			  sum+=m[j];
		  }
		  
		  	double percentage ;
	        percentage =(float)(sum)/m.length;
	        if(percentage>100){
	            System.out.println("Invalid data entered");
	        }else {
	            System.out.print("Percentage of " + name +" is "+percentage);
	            if(percentage<35){
	                System.out.print(" Student Failed in the exam");
	            } else if(percentage>=35 && percentage <50){
	                System.out.print(" and grade is  C ");
	            }
	            else if(percentage>=50 && percentage <60){
	                System.out.print(" and grade is  C+");
	            }
	            else if(percentage>=60 && percentage <70){
	                System.out.print(" and grade is  B ");
	            }else if(percentage>=70 && percentage <80){
	                System.out.print(" and grade is   B+ ");
	            }else if(percentage>=80 && percentage <90){
	                System.out.print(" and grade is   A ");
	            }else {
	                System.out.print(" and grade is A+ ");
	            }
	        }
	    }
	
	
	
	
	
	
	public static void main(String[] args) {
		Student s=new Student();
		s.printData("GAURAV", 70,80,50,-90,45);
		
	}

}
