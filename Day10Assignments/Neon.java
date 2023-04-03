package StringAssignments;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int s= in.nextInt();
        int sq= s*s;
        int sum=0;
        int i=0;
        while(sq>=0){
            int rem =sq%10;
            sum=sum+rem;
            sq=sq/10;
            System.out.println("in loop");
            System.out.println(i);
            i++;
        }
        if(s==sum){
            System.out.println("Neon number");
        }else {
            System.out.println("Not neon number");
        }

    }
}
