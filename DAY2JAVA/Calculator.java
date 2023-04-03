

import java.util.*;

class Calculator{
    char c;
    double i,j;

    public double getData(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter two number");
        i=in.nextInt();
        j=in.nextInt();
        System.out.println("Enter the operator");
        c= in.next().charAt(0);
        if(c=='+'){
            return addition();

        }
        if(c=='-'){
            return subtraction();

        }
        if(c=='*'){
            return multiplication();

        }
        if(c=='/'){
            return division();

        }

        return 0;
    }

    public double addition(){
        return i+j;
    }

    public double subtraction(){
        return i-j;
    }

    public double multiplication(){
        return i*j;
    }

    public double division(){
        return i/j;
    }

    public static void main(String[]args){
        Calculator c= new Calculator();
        System.out.println(c.getData());

    }


}