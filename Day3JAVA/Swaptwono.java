

import java.util.Scanner;

public class Swaptwono {
    int num1,num2,temp;
    public void swap(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter two no ");
        num1=in.nextInt();
        num2=in.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number after swapping " +num1 +" " + num2);
    }

    public static void main(String[] args) {
        Swaptwono s=new Swaptwono();
        s.swap();
    }
}
