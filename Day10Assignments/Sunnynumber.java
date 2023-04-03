package StringAssignments;

import java.util.Scanner;

public class Sunnynumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int s= in.nextInt();
        int next=s+1;
        float  sq= (float) Math.sqrt(next);
        int n =(int)sq;
        if(sq==n){
            System.out.println("Given number is a Sunny Number");
        }
        else{
            System.out.println("Given number is not a Sunny Number");
        }
    }


}
