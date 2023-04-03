

import java.util.Scanner;

public class Factorial {
    int num;



    public String  fact(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number:");
        num = in.nextInt();
        int factorial=1;
        while(num>1){
            factorial=factorial*num;
            num--;
        }
        return ("Factorial is "+ factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact());
    }

}
