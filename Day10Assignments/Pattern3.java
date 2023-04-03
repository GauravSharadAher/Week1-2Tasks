
public class Pattern3 {

	public static void main(String[] args) {
	 
		 for(int i=0 ;i<=3;i++)
		 {for(int k=0; k<=10-2*i; k++) {
				System.out.print(" "); 
			}
			 for(int j=0;j<=i;j++) {
			
				System.out.print("*");
				for(int m=0; m<3; m++) {
					System.out.print(" ");
				}
			}
			 System.out.println();

	}

}
}



